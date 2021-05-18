/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

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
    
    public boolean login(){
        return true;
    }
    public boolean register(){
        return true;
        
        
    }
}
