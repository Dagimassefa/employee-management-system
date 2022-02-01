/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;
import java.sql.*;

/**
 *
 * @author User
 */
public class A {
    Connection con;
    Statement stm=null;
    A(){
   String MySQLURL = "jdbc:mysql://localhost:3306/payrollnew?useSSL=false";
      String databseUserName = "root";
      String databasePassword = "aakfd&da";
      Connection con = null;
      try {
         con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
         if (con != null) {
            System.out.println("Database connection is successful !!!!");
         }
      } catch (Exception e) {
         e.printStackTrace();
      }}
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a=new A();
        
        // TODO code application logic here
    }
    
}
