package com.beanlifecyle.annotation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/springframwork";
	private String userName = "root";
	private String password = "Nitish@12";

	public void selectAllRows() throws ClassNotFoundException, SQLException {

		// load Driver
		Class.forName(driver);

		// get connection
		Connection con = DriverManager.getConnection(url, userName, password);

		// Execute Query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM springframwork.hostalstudentinfo");

		while (rs.next()) {
			int student_id = rs.getInt(1);
			String student_name = rs.getString(2);
			String hostalfees = rs.getString(3);
			String foodType = rs.getString(4);

			System.out.println(student_id + " " + student_name + " " + hostalfees + " " + foodType);
		}
		con.close();

	}

	public void deleteStudentInfo(int studentId) throws ClassNotFoundException, SQLException {

		Class.forName(driver);

		// get connection
		Connection con = DriverManager.getConnection(url, userName, password);

		// Execute Query
		Statement stmt = con.createStatement();
		stmt.executeUpdate("DELETE FROM springframwork.hostalstudentinfo WHERE student_id= " + studentId);

		System.out.println("Record delete from the Id : " + studentId);

		con.close();
	}
}
