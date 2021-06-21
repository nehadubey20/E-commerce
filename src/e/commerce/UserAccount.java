/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;

/**
 *
 * @author Tahniya
 */
public class UserAccount {
    User usr1=new User();
    Connection con=DBConnector.getConnection();
    Scanner sc=new Scanner(System.in);
    public void viewProfile()
    {
        System.out.println(usr1.getUserId());
        System.out.println(usr1.getUsername());
        System.out.println(usr1.getEmail());
        System.out.println(usr1.getContact());
        System.out.println(usr1.getAddress());
     }
    
    public void editProfile()
    {
        System.out.println("Choose Option: \n1. Update Name \n2. Update Password \n3. Update Email ID \n4. Update Contact Number \n5. Update Address");
        int opt;
        String uName = null, emailID = null, contactNo = null,userAddress = null;
        String pass, pass1 = null;
        opt=sc.nextInt();
        switch(opt)
        {
            case 1:
                System.out.println("Enter New Username:");
                uName=sc.nextLine();
            
            case 2:
                do{
                System.out.println("Enter New Password:");
                pass=sc.nextLine();
                System.out.println("Confirm Password:");
                pass1=sc.nextLine();
                if(pass.equals(pass1))
                {
                   System.out.println("Passwords don't match"); 
                }
            }while(pass.equals(pass1)==false);
                
            case 3:
                System.out.println("Enter New EmailID:");
                emailID=sc.nextLine();
                
            case 4:
                System.out.println("Enter New Contact Number:");
                contactNo=sc.nextLine();
                
            case 5:
                System.out.println("Enter New Address:");
                userAddress=sc.nextLine();
        } 
        try
        {
            String query = "update users set userName='"+uName+"',e-mail='"+emailID+"',password='"+pass1+"',contact='"+contactNo+"',address='"+userAddress+
                    "' where user_id='"+usr1.getUserId()+"'";
            usr1.setUsername(uName);
            usr1.setPassword(pass1);
            usr1.setEmail(emailID);
            usr1.setContact(contactNo);
            usr1.setAddress(userAddress);
            
            PreparedStatement acc = con.prepareStatement(query);
			acc.setString(1,uName);
			acc.setString(2,emailID);
			acc.setString(3,pass1);
			acc.setString(4,contactNo);
                        acc.setString(5,userAddress);
			acc.executeUpdate();
			System.out.println("Profile edited successfully!");
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    } 
    
    }  

