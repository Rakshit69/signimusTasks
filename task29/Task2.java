package task29;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Task2 {
    public static void main(String[] args) {
        //Call a stored procedure using CallableStatement to retrieve employee details.
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root",
                    "root");
                    // Create a statement object
                    CallableStatement cs = conn.prepareCall("call getEmployeeDetails(?)");
                    // Set the parameter
                    cs.setInt(1, 1);
                    // Execute the stored procedure
                    cs.execute();
                    // Get the result set
                    ResultSet rs = cs.getResultSet();
                    // Process the result set
                    while (rs.next()) {
                        System.out.println("Employee ID: " + rs.getInt("employee_id"));
                        System.out.println("Employee Name: " + rs.getString("employee_name"));
                        System.out.println("Employee Salary: " + rs.getDouble("employee_salary"));
                        }
                        // Close the result set
                        rs.close();
                        // Close the callable statement
                        cs.close();
                        // Close the connection
                        conn.close();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
    }
}
