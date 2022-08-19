package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		  try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			  } catch (ClassNotFoundException e) {
			   e.printStackTrace();
			  }
			  try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Computer");
			    Statement st = con.createStatement();) {
			   String query = "UPDATE EMP SET E_NAME='ABCD' WHERE E_ID=2";
			   int count = st.executeUpdate(query);
			   if (count != 0) {
			    System.out.println("Record UPDATED");
			   } else {
			    System.out.println("Record Not UPDATED");
			   }
			  } catch (SQLException se) {
			   se.printStackTrace();
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
	}

}
