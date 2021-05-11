/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class Login extends User{
    
    public static void login()
    {
        User user=new User();
        Connection con=DBConnector.getConnection();
	Scanner sc= new Scanner(System.in);
	String email,password;

        System.out.println("Enter your E-mail:");
        email=sc.nextLine();
        
        System.out.println("Enter your password:");
        password=sc.nextLine();
        
	try
        {
            String query = "select * from users(email,password)";
            if(isEmailExist(email)==true && isPwdExist(password)==true)
            {
  		System.out.println("User Login Successfully");
            }
            else
            {
                System.out.println("Email/Password does not exist!!");
            }
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static boolean isEmailExist(String email)
	{
		boolean email_exist=false;
		Connection con=DBConnector.getConnection();
		String query="Select email from users where email=?";
		try
		{
			PreparedStatement stmt =con.prepareStatement(query);
			stmt.setString(1,email);
			ResultSet rs= stmt.executeQuery();
			String emailcounter;
			if(rs.next())
			{
				emailcounter=rs.getString("email");
				if(emailcounter.equals(email))
				{
					System.out.println("email exist!");
						return email_exist=true;
				}
                                
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(email_exist);
		return email_exist;
	}
        
    	public static boolean isPwdExist(String password)
	{
		boolean pwd_exist=false;
		Connection con=DBConnector.getConnection();

		String query="Select password from users where password=?";

		try
		{
			PreparedStatement stmt =con.prepareStatement(query);
			stmt.setString(1,password);
			ResultSet rs= stmt.executeQuery();
			String pwdcounter;
			if(rs.next())
			{
				pwdcounter=rs.getString("password");
				if(pwdcounter.equals(password))
				{
					System.out.println("Entered password exist!");
						return pwd_exist=true;
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(pwd_exist);
		return pwd_exist;

	}

}    
    

