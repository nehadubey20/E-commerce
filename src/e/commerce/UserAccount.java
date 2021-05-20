/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class UserAccount {
    User usr1=new User();
    Connection con=DBConnector.getConnection();
    Scanner sc=new Scanner(System.in);
    public void viewProfile(User usr)
    {
        
        usr.getUsername();
        usr.getEmail();
        usr.getContact();
        usr.getAddress();
        System.out.println("User Id: "+usr.getUserId());
        System.out.println("User Username: "+usr.getUsername());
        System.out.println("User Email: "+usr.getEmail());
        System.out.println("User Contact: "+usr.getContact());
        
        
        
    }

    public void editProfile()
    {
        String pass, pass1;
        try
        {
            String query = "insert into users(username,email,password,contact,address) values (?,?,?,?,?)";
            System.out.println("Enter New Username:");
            String uName=sc.nextLine();
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

            System.out.println("Enter New EmailID:");
            String emailID=sc.nextLine();
            System.out.println("Enter New Contact Number:");
            String contactNo=sc.nextLine();
            System.out.println("Enter New Address:");
            String userAddress=sc.nextLine();
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
            System.out.println("Exception: "+e);
        }

}
}
