
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author adarsh
 */
public class DbConnection {
   static Connection con;
   static public Connection getConnection()
     {
       try
       {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_software","root","sitaram");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return con;  
    }   
}
