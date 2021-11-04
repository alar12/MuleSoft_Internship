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
				Statement st=conn.createStatement();				
				int n=st.executeUpdate("create table movies(movie_n text,actor_n text,actress_n text,year_ int)");
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 }
}
