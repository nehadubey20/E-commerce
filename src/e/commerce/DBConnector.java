/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author NEHA
 */
public class DBConnector {
 	
	private static Connection conn=null;
	
	private DBConnector(){}


	public static Connection getConnection()
	{  
          if(conn==null)
          {
            try
            {
        	Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercedb","root","test");
		System.out.println(conn);
                //conn.close();
            }
            catch(Exception e)
            {
		System.out.println(e);
            }	
          }
        return conn;
	}
//        public static void main(String[] args) {
//	Connection con=DBConnector.getConnection();
//
//    }
}


