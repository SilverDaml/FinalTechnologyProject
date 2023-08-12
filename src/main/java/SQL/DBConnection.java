
package SQL;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import logic.Customer;
import logic.LogicController;


public class DBConnection {

    
    public static void main(String[] args) {
        connect();
    }
    
    LogicController logCon = new LogicController();
    
    Customer customer = new Customer();
    
    
    
    
    // Method to connect Java with MySQL Workbench
    public static void connect() {
        
        Connection myC = null;
        String driver = "com.mysql.jdbc.Driver";
        
        try {
            
           Class.forName(driver);
            System.out.println("Driver successfully loaded");
            
           try {
               myC = DriverManager.getConnection("jdbc:mysql://localHost:3306/gers_garage?characterEncoding=latin1", "root", "root");
           if(myC != null) {
               System.out.println("Successfully connected");
           }
           
           }catch(SQLException e) {
                   
                System.out.println("Error while trying to connect to Databse, " + e.getMessage());
           }
        } catch(Exception e) {
            
            
            System.out.println("A error has ocurred while loding the driver" + e.getMessage());
        }
    }
    
}
