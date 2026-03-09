package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
        String username = "root";
        String pass = "root";
        

        try {
            // 1. Load Driver (optional in newer versions, but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(url, username, pass);
            System.out.println("Connected successfully!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            

            
            String query2 = "INSERT INTO employees (first_name, last_name, email, salary, hire_date)\r\n"
            		+ "VALUES \r\n"
            		+ "('Will', 'Smith', 'will.smith@example.com', 92000.00, '2021-03-10')";  // change table name accordingly
            stmt.execute(query2);
            
            String query = "SELECT * FROM employees";  // change table name accordingly
            ResultSet rs = stmt.executeQuery(query);

            // 5. Process Result using .next()
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);

                System.out.println("ID: " + id + " Name: " + name);
            }

            // 6. Close resources
            rs.close();
            stmt.close();
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        }
    }
}