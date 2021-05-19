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
public class Browse {
    //User usr;
    
    public static void browse()
    {  
        Scanner sc=new Scanner(System.in);
	System.out.println("....Select Categories....");
				
	while(true)
	{
        	System.out.println("1. Mobiles");
		System.out.println("2. Laptop");
		System.out.println("3. PC");
		System.out.println("4. Accessories");
                System.out.println("5. Smart Watch");
		System.out.println("6. Tablet");
		System.out.println("7. Cameras");
		System.out.println("8. Exit");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
                	case 1: ; break;
			case 2:  ; break;
			case 3: ; break;
                        case 4: ; break;
                        case 5: ; break;
                        case 6: ; break;
                        case 7:;break;
			case 8: System.exit(0) ;
			default: System.out.println("Enter a valid choice!");		
		}
						
		}

    }
    
}
