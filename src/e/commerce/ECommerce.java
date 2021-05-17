/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class ECommerce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int browse;
	int choice;
        Login login = new Login();
        Scanner sc=new Scanner(System.in);
	System.out.println("....Welcome to MART....");
				
	while(true)
	{
        	System.out.println("1. Login");
		System.out.println("2. New user?? Register");
		System.out.println("3. Browse");
		System.out.println("4. Quit");
		
		choice=sc.nextInt();
		switch(choice)
		{
                	case 1:  
                                if(Login.login())
                                {
                                    System.out.println("User Login Successfully!");
                                }
                                else
                                {
                                    System.out.println("Invalid Id or Password");
                                }
                                break;
			case 2: Register.register() ; break;
			case 3: ; break;
			case 4: System.exit(0) ;
			default: System.out.println("Enter a valid choice!");		
		}
						
		}

    }
    
}
