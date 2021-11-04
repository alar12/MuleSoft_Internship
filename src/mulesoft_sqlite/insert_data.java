package mulesoft_sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;

public class insert_data {
	public static void main(String[] args) {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 String dbURL ="jdbc:sqlite:movies.db";
			 Connection conn=DriverManager.getConnection("jdbc:sqlite:movies.db");
			 if(conn!=null) {
				System.out.println("connection established successful");
				Scanner sc=new Scanner(System.in);
				 System.out.println("Enter movie name:");
				 String  movie_n=sc.next();
				 System.out.println("Enter actor name:");
				 String  actor_n=sc.next();
				 System.out.println("Enter actress name:");
				 String  actress_n=sc.next();
				 System.out.println("Enter year:");
				 int year_=sc.nextInt();
				 
				PreparedStatement pt=conn.prepareStatement("insert into movies values(?,?,?,?)");
				 pt.setString(1, movie_n);
				 pt.setString(2, actor_n;
				 pt.setString(3, actress_n);
				 pt.setInt(4, year_);
				 int n=pt.executeUpdate();
				 System.out.println(n);
				 
			
				
			 }
			 else {
				 System.out.println("not connected");
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
}
