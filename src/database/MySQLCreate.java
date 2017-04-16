package database;

import java.sql.*;

public class MySQLCreate {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/";

   //  Database credentials
   static final String USER = "username";
   static final String PASS = "password";
   
   public MySQLCreate(){
	   try{
		   Class.forName("com.mysql.jdbc.Driver");
	   }catch(Exception e){}
   }
   
   public void create(String s){
	   Connection conn = null;
	   Statement st = null;
	   try{
		   conn = DriverManager.getConnection(DB_URL, "root", "");
		   System.out.println("Connecting....");
		   st = conn.createStatement();
		   String sql = "CREATE DATABASE "+ s;
		   st.executeUpdate(sql);
		   System.out.println("Database Create succesfully....");
		   
	   }catch(Exception e){
		   System.out.println(e.getMessage());
	   }finally{
		   try{
			   if(st != null)
				   st.close();
		   }catch(Exception e){}
		   try{
			   if(conn != null)
				   conn.close();
		   }catch(Exception e){}
		   System.out.println("closed connection....");
	   }
   }
   
//   public static void main(String[] args) {
//   Connection conn = null;
//   Statement stmt = null;
//   try{
//      //STEP 2: Register JDBC driver
//      Class.forName("com.mysql.jdbc.Driver");
//
//      //STEP 3: Open a connection
//      System.out.println("Connecting to database...");
//      conn = DriverManager.getConnection(DB_URL, USER, PASS);
//
//      //STEP 4: Execute a query
//      System.out.println("Creating database...");
//      stmt = conn.createStatement();
//      
//      String sql = "CREATE DATABASE STUDENTS";
//      stmt.executeUpdate(sql);
//      System.out.println("Database created successfully...");
//   }catch(SQLException se){
//      //Handle errors for JDBC
//      se.printStackTrace();
//   }catch(Exception e){
//      //Handle errors for Class.forName
//      e.printStackTrace();
//   }finally{
//      //finally block used to close resources
//      try{
//         if(stmt!=null)
//            stmt.close();
//      }catch(SQLException se2){
//      }// nothing we can do
//      try{
//         if(conn!=null)
//            conn.close();
//      }catch(SQLException se){
//         se.printStackTrace();
//      }//end finally try
//   }//end try
//   System.out.println("Goodbye!");
//}//end main
}//end JDBCExample
