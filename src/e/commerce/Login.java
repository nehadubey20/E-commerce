/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class Login {

        //public static String useremail;

    public static boolean login() {
        User user = new User();
        Connection con = DBConnector.getConnection();
        Scanner sc = new Scanner(System.in);
        String email, password;
        boolean isLoggedIn = false;

        System.out.println("Enter your E-mail:");
        email = sc.nextLine();
        user.setEmail(email);

        System.out.println("Enter your password:");
        password = sc.nextLine();
        user.setPassword(password);

        try {
            if (isEmailExist(email) == true && isPwdExist(password) == true) {

                Statement st = con.createStatement();
                String query = "select * from users where email='" + email + "' and password='" + password + "'";
                ResultSet set = st.executeQuery(query);
                set.next();
                user.setUserId(set.getInt(1));
                user.setUsername(set.getString(2));
                user.setEmail(set.getString(3));
                user.setPassword(set.getString(4));
                user.setContact(set.getString(5));
                user.setAddress(set.getString(6));
                user.setIsLoggedIn(true);
                
                CurrentUserLoggedIn.user = user;
                

                isLoggedIn = true;
                user.setIsLoggedIn(isLoggedIn);
                return true;
            } else {
                isLoggedIn = false;
                user.setIsLoggedIn(isLoggedIn);
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static boolean isEmailExist(String email) {
        boolean email_exist = false;
        Connection con = DBConnector.getConnection();
        String query = "Select email from users where email=?";
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            String emailcounter;
            if (rs.next()) {
                emailcounter = rs.getString("email");
                if (emailcounter.equals(email)) {
                    //System.out.println("email exist!");
                    return email_exist = true;
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        //System.out.println(email_exist);
        return email_exist;
    }

    public static boolean isPwdExist(String password) {
        boolean pwd_exist = false;
        Connection con = DBConnector.getConnection();

        String query = "Select password from users where password=?";

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, password);
            ResultSet rs = stmt.executeQuery();
            String pwdcounter;
            if (rs.next()) {
                pwdcounter = rs.getString("password");
                if (pwdcounter.equals(password)) {
                    //	System.out.println("Entered password exist!");
                    return pwd_exist = true;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pwd_exist;

    }

}
