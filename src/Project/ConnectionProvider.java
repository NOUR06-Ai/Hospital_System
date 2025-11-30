 package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class ConnectionProvider {
 
   public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "061106"
            );
            return con;
        } catch (Exception e) {
       //System.out.println(e);
       e.printStackTrace();
            return null;
        }
    }
}