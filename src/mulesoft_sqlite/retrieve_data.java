package mulesoft_sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class retrieve_data {
	public static void main(String[] args) {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 String dbURL ="jdbc:sqlite:movies.db";
			 Connection conn=DriverManager.getConnection("jdbc:sqlite:movies.db");
			 if(conn!=null) {
				 System.out.println("connection established successful");
				Statement st=conn.createStatement();				
			
				 PreparedStatement pt=conn.prepareStatement("select * from movies ");
				 ResultSet rs=pt.executeQuery();
				 System.out.println("movie_name\tactor_name\tactress_name\tyear");
				 System.out.println("________________________________________________");
				 while(rs.next()) {
					 System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
		 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
}
