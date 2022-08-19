package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Computer");
				    Statement st = con.createStatement();) {
				   String query = "INSERT INTO EMP(E_ID,E_NAME,E_AGE) values(4,'Vidit',23)";
				   int count = st.executeUpdate(query);
				   if (count == 0) {
				    System.out.println("Record not inserted");
				   } else {
				    System.out.println("Record Inserted");
				   }
				  } catch (SQLException se) {
				   se.printStackTrace();
				  } catch (Exception e) {
				   e.printStackTrace();
				  }
	}
}
