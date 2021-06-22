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

/**
 *
 * @author NEHA
 */
public class User {
    
    private int userId;
    private String username;
    private String email;
    private String password;
    private String contact;
    private String address;
    private boolean isLoggedIn=false;
    
    public User(){
    }
    
    public User(String email,String password,boolean isLoggedIn)
    {
        this.email=email;
        this.password=password;
        this.isLoggedIn=isLoggedIn;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isIsLoggedIn() {
        return isLoggedIn;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public boolean login(){
        return true;
    }
    public boolean register(){
        return true;
        
        
    }
    
    
    public void getUserDetail()
    {
        try
        {
            Connection con = DBConnector.getConnection();
            Statement st = con.createStatement();
            String query = "Select user_id,userName,email,contact,address from users";
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                userId = rs.getInt(1);
                username=rs.getString(2);
                email=rs.getString(3);
                contact=rs.getString(4);
                address=rs.getString(5);
                System.out.println(userId+""+ username);
                
            
            }
            
            

        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }

    int setUserId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
