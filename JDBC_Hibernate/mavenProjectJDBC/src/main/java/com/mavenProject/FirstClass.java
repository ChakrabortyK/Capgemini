package com.mavenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FirstClass {
	
	public static void main(String args[]) {
		String url = "jdbc:mysql://127.0.0.1:3306/jdbc";
        String username = "root";
        String pass = "root";
        

        try {
        
			Class.forName("com.mysql.cj.jdbc.Driver");
			

            Connection con = DriverManager.getConnection(url, username, pass);            
            System.out.println("Connected successfully!");


            Statement stmt = con.createStatement();

            
            String query = "SELECT * FROM student";  // change table name accordingly
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()) {
            	int id = rs.getInt(1);
                String name = rs.getString(2);

                System.out.println("ID: " + id + " Name: " + name);
            }

        }catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

	}
}

