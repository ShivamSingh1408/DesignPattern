package com.aurionpro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "Computer");
				Statement st = con.createStatement();) {
			String query = "DELETE FROM EMP WHERE E_ID=3";
			int count = st.executeUpdate(query);
			if (count != 0) {
				System.out.println("Record Deleted");
			} else {
				System.out.println("Record Not Deleted");
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
