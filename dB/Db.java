package com.java.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.java.model.LoginForm;


public class DB {
  
	 public static Connection getConnectionDb() {
		 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root","");
		 }catch(Exception e) {
			 
		 }
		 return null;
		// return DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
				 }
	

}