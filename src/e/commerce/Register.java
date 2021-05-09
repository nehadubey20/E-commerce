/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class Register {
    
    public static void register()
	{
		Connection con=DBConnector.getConnection();
		Scanner sc1= new Scanner(System.in);
		String username,email,password,contact;

		int userId;
		try
		{
			String query = "insert into users(username,email,password,contact) values (?,?,?,?)";
			System.out.println("Enter User Name:");
			username=sc1.nextLine();
			System.out.println("Enter Email ID:");
			email=sc1.nextLine();
			System.out.println("Enter Password:");
			password=sc1.nextLine();
			System.out.println("Enter Contact:");
			contact=sc1.nextLine();	
			
//			if(isEmailExist(email)==false && isPhoneExist(phone)==false)
//			{			
//			
                        PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2,email);
			stmt.setString(3,password);
			stmt.setString(4,contact);
			stmt.executeUpdate();
			System.out.println("User Registered Successfully");
			//}

			//con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
