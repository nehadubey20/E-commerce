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
        // TODO code application logic here
        
	int ch;

        Scanner sc=new Scanner(System.in);
	System.out.println("....Employee Details....");
				
	while(true)
	{
        	System.out.println("1. New Employee");
		System.out.println("2. Show All Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Delete Employee");
		System.out.println("5. Exit");

		ch=sc.nextInt();
		switch(ch)
		{
                	case 1:  ; break;
			case 2:  ; break;
			case 3: ; break;
			case 4: ; break;
			case 5: System.exit(0) ;
			default: System.out.println("Enter a valid choice!");		
		}
						
		}

    }
    
}
