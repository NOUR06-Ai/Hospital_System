package Project;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    
    public static Connection getConnection() {
        Connection con = null;

        try {
            String url = "jdbc:mysql://localhost:3306/College";
            String user = "root";
            String pass = "Atef1967";

            con = DriverManager.getConnection(url, user, pass);
            return con;
//            System.out.println("Connected Successfully!");
        } catch (Exception e) {
//            System.out.println("Connection Error: " + e.getMessage());
        }

        return con;
    }
}