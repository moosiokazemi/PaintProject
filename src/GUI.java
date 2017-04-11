import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;

import java.awt.Color;


public class GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("خط");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(541, 40, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("دایره");
		button_1.setBounds(541, 85, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("مسطتیل");
		button_2.setBounds(541, 130, 89, 23);
		contentPane.add(button_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("آبی");
		rdbtnNewRadioButton.setBounds(569, 225, 55, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("سبز");
		rdbtnNewRadioButton_1.setBounds(569, 250, 55, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("قرمز");
		rdbtnNewRadioButton_2.setBounds(569, 275, 55, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("مشکی");
		rdbtnNewRadioButton_3.setBounds(569, 300, 69, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JButton btnNewButton = new JButton("خروج");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(541, 480, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("انتخاب رنگ");
		label.setBounds(557, 200, 69, 14);
		contentPane.add(label);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 500, 500);
		contentPane.add(panel);
	}
}

