package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

    public static int executeSql(String name,String pass) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
    //          new com.mysql.jdbc.Driver();
            Class.forName("com.mysql.jdbc.Driver").newInstance();
                        //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=");
            String connectionUrl = "jdbc:mysql://localhost:3306/paintdb";
            String connectionUser = "root";
            String connectionPassword = "";
            conn = DriverManager.getConnection(connectionUrl, connectionUser, connectionPassword);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM person where pName='"+name+"' and password= '"+pass+"';");
            int id=-1;
            while (rs.next()) {
                 id = Integer.parseInt(rs.getString("personId"));
               
            }
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (stmt != null) stmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
		return -1;
    }
	
}//end of DataBase class
	
