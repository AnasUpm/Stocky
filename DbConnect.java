package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author hocin
 */
public class DbConnect {
    
    private static String HOST = "192.168.0.17";
        private static int PORT = 3306;
        private static String DB_NAME = "inventory";
        private static String USERNAME = "root";
        private static String PASSWORD = "";
        private static Connection connection ;
        
        
        public static Connection getConnect (){
        try {
        	DriverManager.getConnection("jdbc:mysql://localhost:3306/:dbregistration","root","");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            return  connection;
        }
        
        
        

    
}