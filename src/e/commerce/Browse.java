
package e.commerce;

import java.util.Scanner;

public class Browse extends AddToCart {
    //User usr;
    
    public  void browse()
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
                System.out.println("9. Back");
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
                	case 1:
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch1;
                            ch1=sc.nextInt();
                            switch(ch1)
                            {
                                case 1:
                                   AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;     
                            }
                            
                        break;
			case 2:
                            System.out.println("1. Apple Macbook Pro\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch2;
                            ch2=sc.nextInt();
                            switch(ch2)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            } 
                        break;
			case 3: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch3;
                            ch3=sc.nextInt();
                            switch(ch3)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;  
                            } 
                             break;
                        case 4:
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch4;
                            ch4=sc.nextInt();
                            switch(ch4)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                            break;
                        case 5: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch5;
                            ch5=sc.nextInt();
                            switch(ch5)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                        break;
                        case 6: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch6;
                            ch6=sc.nextInt();
                            switch(ch6)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;   
                            }
                        break;
                        case 7:System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch7;
                            ch7=sc.nextInt();
                            switch(ch7)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                        break;
			case 8: System.exit(0) ;
                        case 9: browse();
			default: System.out.println("Enter a valid choice!");		
		}
						
		}
    }

}

/*
package e.commerce;

import java.util.Scanner;

public class Browse  {
    //User usr;
    String str[] = new String[10];
    double total[] = new double[10];
    int k=0;
    double Sum;
    public  void browse()
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
                	case 1:
                            System.out.println("1.IphoneX\t Rs.90,000\n2.Samsung Note 5\tRs.80,000\n3.Vivo V11 Pro\tRs.30,000\n4. Redmi Note 9 pro\tRs. 20,000");
                            System.out.println("Enter your choice");
                            int ch1;
                            ch1=sc.nextInt();
                            switch(ch1)
                            {
                                case 1:
                                   str[k]="IphoneX";
                                   Sum=Sum+total[k];
                                   k++;
                                   
                                    break;
                                 
                                case 2:
                                   str[k]="Samsung note 5";
                                   Sum=Sum+total[k];
                                   k++;
                                   
                                    break;
                                    
                                case 3:
                                    str[k]="Vivo V11 Pro";
                                    Sum=Sum+total[k];
                                   k++;
                                   
                                    break;
                                case 4:
                                    str[k]="Redmi Note 9 Pro";
                                    Sum=Sum+total[k];
                                    k++;
                                    break;     
                            }
                            
                        break;
			case 2:
                            System.out.println("1. Dell\tRs.1,24,000\n2.Lenovo\tRs.96,000");
                            System.out.println("Enter your choice");
                            int ch2;
                            ch2=sc.nextInt();
                            switch(ch2)
                            {
                                case 1:
                                    str[k]="Dell";
                                    Sum=Sum+total[k];
                                    k++;
                                    break;
                                 
                                case 2:
                                    str[k]="Lenovo";
                                    Sum=Sum+total[k];
                                    k++;
                                    break;
                                    
              
                            } 
                        break;
			/*case 3: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch3;
                            ch3=sc.nextInt();
                            switch(ch3)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;  
                            } 
                             break;
                        case 4:
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch4;
                            ch4=sc.nextInt();
                            switch(ch4)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                            break;
                        case 5: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch5;
                            ch5=sc.nextInt();
                            switch(ch5)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                        break;
                        case 6: 
                            System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch6;
                            ch6=sc.nextInt();
                            switch(ch6)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;   
                            }
                        break;
                        case 7:System.out.println("1. Iphone X\n2.Samsung Note 5 \n 3. Vivo V11 Pro \n 4. Redmi Note 9 pro");
                            System.out.println("Enter your choice");
                            int ch7;
                            ch7=sc.nextInt();
                            switch(ch7)
                            {
                                case 1:
                                    AddInCart("Iphone X");
                                    break;
                                 
                                case 2:
                                    AddInCart("Samsung Note 5");
                                    break;
                                    
                                case 3:
                                    AddInCart("Vivo Vll Pro");
                                    break;
                                case 4:
                                    AddInCart("Redmi Note 9 Pro");
                                    break;
                            }
                        break;
			case 8: System.exit(0) ;
			default: System.out.println("Enter a valid choice!");	
                         
		}
						
		}
        }
        public void show()
        {
            System.out.println("Product in Cart...");
            for(int i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
            }
            
        }
        public void Total()
        {
            System.out.println("The Total amount to be paid is");
            for(int i=0;i<str.length;i++)
            {
                System.out.println("str[i]\t\ttotal[i]\n");
            }
            System.out.println("Total\t\t"+Sum);
        }
    }
    
    
 */

