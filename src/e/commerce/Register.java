/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class Register {
    
        //public static String useremail;

    public static void register()
	{
		Connection con=DBConnector.getConnection();
		Scanner sc1= new Scanner(System.in);
		String username,email,password,contact,address;
                //boolean isLoggedIn;
                //Creating object of user
                User user =new User();
//                ArrayList<User> alu = new ArrayList<User>();
		//int userId;
		try
		{
			String query = "insert into users(username,email,password,contact,address) values (?,?,?,?,?)";
			System.out.println("Enter User Name:");
			username=sc1.nextLine();
                        user.setUsername(username);
                        
			System.out.println("Enter Email ID:");
			email=sc1.nextLine();
			user.setEmail(email);
                        
                        System.out.println("Enter Password:");
			password=sc1.nextLine();
			user.setPassword(password);
                        
                        System.out.println("Enter Contact:");
			contact=sc1.nextLine();	
			user.setContact(contact);
                        
                        System.out.println("Enter Address:");
			address=sc1.nextLine();	
			user.setAddress(address);
                        
                        //user.setIsLoggedIn(isLoggedIn);
                        
                        ArrayList al = new ArrayList();
                        for(int i=0;i<al.size();i++)
                        {
                            al.add(user);
                            System.out.println("Userdata :"+al);
                        }
//			if(isEmailExist(email)==false && isPhoneExist(phone)==false)
//			{			
//			
                        PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1,username);
			stmt.setString(2,email);
			stmt.setString(3,password);
			stmt.setString(4,contact);
                        stmt.setString(5,address);
			stmt.executeUpdate();
			System.out.println("User Registered Successfully");
			//}
                        
                        
                        if(stmt.executeUpdate()>0)
                        {
                            
                            String cre="Create table "+username+"(user_id int,productId int,ProductName varchar(255),productPrice double,Quantity int,Total double)";
                            stmt.execute(cre);
                            System.out.println(username+" table created successfully!");
                        }

			//con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
    
}
