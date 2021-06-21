/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 *
 * @author Tahniya
 */
public class UserAccount {

    User usr1 = new User();

    Scanner sc,scan;

    Connection con = DBConnector.getConnection();

    public void viewProfile() {
        usr1 = CurrentUserLoggedIn.user;
        sc = new Scanner(System.in);

        System.out.println(usr1.getUserId());
        System.out.println(usr1.getUsername());
        System.out.println(usr1.getEmail());
        System.out.println(usr1.getContact());
        System.out.println(usr1.getAddress());
    }

    public void editProfile() {
        sc = new Scanner(System.in);
        scan=new Scanner(System.in);
        System.out.println("Choose Option: \n1. Update Name \n2. Update Password \n3. Update Email ID \n4. Update Contact Number \n5. Update Address");
        int opt;
        String uName = "", emailID = "", contactNo = "", userAddress = "";
        String pass, pass1 = "";
        opt = sc.nextInt();
        sc.reset();
        if (opt == 1) {
            System.out.println("Enter New Username:");
            uName = scan.nextLine();
        } else if (opt == 2) {
            do {
                System.out.println("Enter New Password:");
                pass = sc.nextLine();
                System.out.println("Confirm Password:");
                pass1 = sc.nextLine();
                if (pass.equals(pass1)) {
                    System.out.println("Passwords don't match");
                }
            } while (pass.equals(pass1) == false);
        } else if (opt == 3) {
            System.out.println("Enter New EmailID:");
            emailID = sc.nextLine();
        } else if (opt == 4) {
            System.out.println("Enter New Contact Number:");
            contactNo = sc.nextLine();
        } else if (opt == 5) {
            System.out.println("Enter New Address:");
            userAddress = sc.nextLine();
        }

        try {
            String query = "update users set userName='" + uName + "',email='" + emailID
                    + "',password='" + pass1 + "',contact='" + contactNo + "',address='" + userAddress
                    + "' where user_id=" + usr1.getUserId();
            usr1.setUsername(uName);
            usr1.setPassword(pass1);
            usr1.setEmail(emailID);
            usr1.setContact(contactNo);
            usr1.setAddress(userAddress);

            Statement acc = con.createStatement();
            acc.executeUpdate(query);
            
            System.out.println("Profile edited successfully!");
        } catch (Exception e) {
            System.out.println("Error: here" + e);
        }
    }

}
