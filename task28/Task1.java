package task28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) {
        //Write a Java program to establish a database connection and display all records from a sample table using Statement.
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
                    "root");
                    // Create a statement object
                    Statement stmt = conn.createStatement();
                    // Execute a query
                    ResultSet rs = stmt.executeQuery("SELECT * FROM sample_table");
                    // Process the result set
                    while (rs.next()) {
                        System.out.println(rs.getString(1) + " " + rs.getString(2) + "");
                        }
                        // Close the result set, statement, and connection
                        rs.close();
                        stmt.close();
                        conn.close();
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

    }
}
