package com.customJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
	        String username = "root";
	        String pass = "root";
	        
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
	            Connection con = DriverManager.getConnection(url, username, pass);
	            System.out.println("Connected successfully!");
	            
	            Scanner sc = new Scanner(System.in);

	            
	            System.out.println("Enter name to insert");
	            String first_name = sc.nextLine();
	            System.out.println("Enter last_name to insert");
	            String last_name = sc.nextLine();
	            System.out.println("Enter email to insert");
	            String email = sc.nextLine();
//	            System.out.println("Enter salary to insert");
//	            String salary = sc.nextLine();
	            
	            PreparedStatement ps = con.prepareStatement("INSERT INTO employees (first_name, last_name, email, salary, hire_date)\r\n"
	            		+ "VALUES \r\n"
	            		+ "(?, ?, ?, 88000, '2026-02-27')");
	            ps.setString(1, first_name);
	            ps.setString(2, last_name);
	            ps.setString(3, email);
//	            ps.setInt(4, Integer.parseInt(salary));
	            
	            ps.executeUpdate();
	            
	            
	            Statement stmt = con.createStatement();
	            String query = "SELECT * FROM employees";  // change table name accordingly
	            ResultSet rs = stmt.executeQuery(query);
	            
	            
//	            System.out.println(rs);
	            while (rs.next()) {
	                int id2 = rs.getInt(1);
	                String name = rs.getString(2);
	                String sal = rs.getString(5);

	                System.out.println("ID: " + id2 + " Name: " + name + " Salary: "+ sal);
	            }
	            

	            rs.close();
//	            stmt.close();
	            con.close();
	            

	            
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        
	        
	}

}
