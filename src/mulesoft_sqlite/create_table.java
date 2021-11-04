package mulesoft_sqlite;
 import java.util.*;
 import java.sql.*;

public class create_table {
	public static void main(String[] args) {
		 try {
			 Class.forName("org.sqlite.JDBC");
			 String dbURL ="jdbc:sqlite:movies.db";
			 Connection conn=DriverManager.getConnection(dbURL);
			 if(conn!=null) {
				 System.out.println("connection established successful");
				Statement st=conn.createStatement();				
				int n=st.executeUpdate("create table movies(movie_name text,actor_name text,actress_name text,yearofrelease int)");	 
			
				
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
}
