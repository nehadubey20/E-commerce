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
public class LoginBean {
        
        private String email;
	private String password;
	private boolean isLoggedin=false;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email =email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 

    public boolean isIsLoggedin() {
        return isLoggedin;
    }

    public void setIsLoggedin(boolean isLoggedin) {
        this.isLoggedin = isLoggedin;
    }
        
	
	
    
}
