/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

/**
 *
 * @author ITI
 */
import java.util.*;
public class AddToCart {
    String str[] = new String[10];
    int k=0;
    void AddInCart(String str1)
    {
        System.out.println("-------------------------------------------------\n\n");
        char ch;
        Scanner sc = new Scanner(System.in);
        
        str[k]=str1;
        k++;
        int ch1;
        System.out.println("Items Added Successfully!");
        System.out.println("-------------------------------------------------\n\n");
        System.out.println("Do you want to add more products? Y/N");
        ch=sc.next().charAt(0);
        if(ch=='N'||ch=='n')
        {
            System.out.println("1.Show Cart\n2. Delete Items\n 3.Checkout\n");
            ch1=sc.nextInt();
            if(ch1==1)
            {
                ShowCart();
            }
            if(ch1==2)
            {
                DeleteItems();
            }
            if(ch1==3)
            {
                Checkout();
            }
        }
        
    }
    
    void ShowCart()
    {
        System.out.println("-------------------------------------------------\n\n");
        Scanner sc = new Scanner(System.in);
        int ch2;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]!=null)
            {
                System.out.println(str[i]);
            }
        }
        System.out.println("-------------------------------------------------\n\n");
        System.out.println("1.Delete Items\n 2.Checkout\n3.Back");
        ch2=sc.nextInt();
        if(ch2==1)
        {
            DeleteItems();
        }
        if(ch2==2)
        {
            Checkout();
        }
    }
    void DeleteItems()
    {
        System.out.println("-------------------------------------------------\n\n");
        Scanner sc = new Scanner(System.in);
        String str2;
        int ch3;
        System.out.println("Enter the Item to be deleted");
        str2 = sc.nextLine();
        for(int i=0;i<str.length;i++)
        {
            if(str2.equalsIgnoreCase(str[i]))
            {
                str[i]=null;
            }
        }
        System.out.println("Item Deleted Successfully");
        System.out.println("-------------------------------------------------\n\n");
        System.out.println("1.show updated cart\n2.Checkout\n3.Back");
        ch3=sc.nextInt();
        if(ch3==1)
        {
            ShowCart();
        }
        if(ch3==2)
        {
            Checkout();
        }
        
    }
    void Checkout()
    {
        
        System.out.println("-------------------------------------------------\n\n");
        System.out.println("Order Placed!");
        System.exit(0);
    }
            
}
