import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import DB.DataBase;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JTextField passtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usertext = new JTextField();
		usertext.setBounds(77, 38, 230, 37);
		contentPane.add(usertext);
		usertext.setColumns(10);
		
		passtext = new JTextField();
		passtext.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key=e.getKeyCode();
				if(key==KeyEvent.VK_ENTER){
					String name =usertext.getText();
					String pass = passtext.getText();
					int id = DataBase.executeSql(name,pass);
					if(id>0 ){
						EventQueue.invokeLater(new Runnable() {
							public void run() {
								try {
									GUI frame = new GUI();
									frame.setVisible(true);
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						});
					}
					else{
						JOptionPane.showMessageDialog(null, "There is something wrong with Username or password !"
								+ "\n Please try again.");
					}
				}
			}
		});
		passtext.setBounds(77, 101, 230, 37);
		contentPane.add(passtext);
		passtext.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0646\u0627\u0645 \u06A9\u0627\u0631\u0628\u0631\u06CC");
		lblNewLabel.setBounds(331, 43, 81, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		lblNewLabel_1.setBounds(331, 106, 62, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton enterbtn = new JButton("\u0648\u0631\u0648\u062F");
		enterbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		enterbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String name =usertext.getText();
				String pass = passtext.getText();
				int id = DataBase.executeSql(name,pass);
				if(id>0 ){
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								GUI frame = new GUI();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else{
					JOptionPane.showMessageDialog(null, "There is something wrong with Username or password !"
							+ "\n Please try again.");
				}
			}
		});
		enterbtn.setBounds(209, 198, 98, 37);
		contentPane.add(enterbtn);
		
		JButton btnNewButton = new JButton("\u062E\u0631\u0648\u062C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(84, 198, 92, 37);
		contentPane.add(btnNewButton);
	}
}
