package mulesoft_sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class retrieve_data_based_on_actors {
	public static void main(String[] args) {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 String dbURL ="jdbc:sqlite:movies.db";
			 Connection conn=DriverManager.getConnection("jdbc:sqlite:movies.db");
			 if(conn!=null) {
				 System.out.println("connection established successful");
				Statement st=conn.createStatement();				
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter actor name:");
			String actor_n=sc.next();
				 PreparedStatement pt=conn.prepareStatement("select * from movies where actor_n=? ");
				 pt.setString(1, actor_n);
				 ResultSet rs=pt.executeQuery();
				 System.out.println("movie_name\tactor_name\tactress_name\tyear");
				 System.out.println("________________________________________________");
				 while(rs.next()) {
					 System.out.println(rs.getString(1));
		 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
}
