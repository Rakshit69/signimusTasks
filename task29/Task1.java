package task29;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Task1 {
    public static void main(String[] args) {
        //Create a JDBC program to insert, update, delete, and retrieve student records from a MySQL database
        //do it 
        //insert
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "root";
        String query = "INSERT INTO student (name, age, email) VALUES ('John Doe', 25, 'john.doe@example.com')"; //insert a new student record
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    java.sql.Connection con = DriverManager.getConnection(url, username, password);
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate(query);
                    System.out.println("Student record inserted successfully");
                    con.close();
                    } catch (ClassNotFoundException e) {
                        System.out.println("Error: " + e.getMessage());
                        } catch (SQLException e) {
                            System.out.println("Error: " + e.getMessage());
                            }
                            //update
                            String query2 = "UPDATE student SET name = 'Jane Doe' WHERE id = 1";
                            try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            java.sql.Connection con = DriverManager.getConnection(url, username, password);
                            Statement stmt = con.createStatement();
                            stmt.executeUpdate(query2);
                            System.out.println("Student record updated successfully");
                            con.close();
                            } catch (ClassNotFoundException e) {
                                System.out.println("Error: " + e.getMessage());
                                } catch (SQLException e) {
                                    System.out.println("Error: " + e.getMessage());
                                    }
                                    //delete
                                    String query3 = "DELETE FROM student WHERE id = 1";
                                    try {
                                    Class.forName("com.mysql.cj.jdbc.Driver");
                                    java.sql.Connection con = DriverManager.getConnection(url, username, password);
                                    Statement stmt = con.createStatement();
                                    stmt.executeUpdate(query3);
                                    System.out.println("Student record deleted successfully");
                                    con.close();
                                    } catch (ClassNotFoundException e) {
                                        System.out.println("Error: " + e.getMessage());
                                        } catch (SQLException e) {
                                            System.out.println("Error: " + e.getMessage());
                                        }

        
    }
}
