/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author NEHA
 */
public class ShowingOptions {
    
    public void showOption() throws SQLException{
        int choice;
        
        AddToCart atc = new AddToCart();
        Browse br = new Browse();
        Login login = new Login();
        User usr = new User();
        
        
        Scanner sc=new Scanner(System.in);
	System.out.println("....Welcome to MART....");
				
	while(true)
	{
        	System.out.println("1. Login");
		System.out.println("2. New user?? Register");
		System.out.println("3. Browse");
                System.out.println("5. Cart");
		System.out.println("4. Quit");
		
		choice=sc.nextInt();
		switch(choice)
		{
                	case 1:  
                                usr.login();
                                if(Login.login())
                                {
                                    System.out.println("User Login Successfully!");
                                    boolean isLoggedIn=true;
                                    
                                    while(true)
                                    {
                                        System.out.println("01. Browse");
                                        System.out.println("02. Add to Cart");
                                        System.out.println("03. User Details");
                                        System.out.println("04. View Cart");
                                        System.out.println("05. Checkout");
                                        System.out.println("06. Exit");
                                        System.out.println("Enter your choice:");
                                        int ch2=sc.nextInt();
                                    
                                    
                                    switch(ch2)
                                    {
                                        case 1: br.browse();
                                        System.out.println("Enter your choice:");
                                        int ch3=sc.nextInt();
                                        br.browseProducts(ch3);
                                        
                                        
                                        break;
                                        
                                        
                                        
                                        case 2:;break;
                                        case 3:;break;
                                        case 4:;break;
                                        case 5:;break;
                                        case 6: System.exit(0) ;
                                        default: System.out.println("Enter a valid choice!");	
                                        
                                    }
                                }
                                }
                                else
                                {
                                    System.out.println("Invalid Id or Password");
                                }
                                break;
			case 2:usr.register(); Register.register() ; break;
			case 3:br.browse() ;
                        System.out.println("Enter your choice:");
                                        int ch3=sc.nextInt();
                                        br.browseProducts(ch3);
                                        
                                        
                                        break;
                                        
			case 4:System.exit(0) ;
                        case 5:
                            /*System.out.println("1.Show Products\n2.Display Total");
                            int ch9;
                            ch9=sc.nextInt();
                            switch(ch9)
                            {
                                case 1:
                                     br.show();
                                    break;
                                case 2:
                                    br.Total();
                            }*/
                            break;
                           
			default: System.out.println("Enter a valid choice!");		
		}
						
		}
	}
}
