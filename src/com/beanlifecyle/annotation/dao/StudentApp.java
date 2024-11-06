package com.beanlifecyle.annotation.dao;

import java.sql.SQLException;

public class StudentApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StudentDao dao = new StudentDao();
		dao.selectAllRows();

		dao.deleteStudentInfo(3);
	}

}
// Caused by: com.mysql.cj.exceptions.CJCommunicationsException: Communications link failure