
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddToCart {


    void AddInCart() {
        User user1 = new User();
        user1 = CurrentUserLoggedIn.user;
        System.out.println("-------------------------------------------------\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product ID");
        int productID;
        productID = sc.nextInt();
        try {
            Connection con = DBConnector.getConnection();
            Statement st = con.createStatement();


            String query2 = "select * from products where productId =" +productID+ ";";
            ResultSet rs2 = st.executeQuery(query2);
            int userId = user1.getUserId();
            String UserName= user1.getUsername();
            String ProductName="";
            double ProductPrice=0.0;
            double total=0.0;
            while (rs2.next()) {
                ProductName = rs2.getString(3);
                ProductPrice = rs2.getDouble(5);
            }
            System.out.println("Enter the Quantity of the product");
            int quantity;
            quantity = sc.nextInt();
            total = ProductPrice * quantity;
            String query5 = "insert into "+UserName+"(user_id,productID,ProductName,productPrice,Quantity,Total) values (?,?,?,?,?,?)";

            PreparedStatement stmt = con.prepareStatement(query5);
            stmt.setInt(1,userId);
            stmt.setInt(2,productID);
            stmt.setString(3,ProductName);
            stmt.setDouble(4,ProductPrice);
            stmt.setInt(5,quantity);
            stmt.setDouble(6,total);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);

        }
        System.out.println("Items Added Successfully!");
        System.out.println("-------------------------------------------------\n\n");
        System.out.println("1.Show Cart\n2.Delete Cart\n3.Total\n4.Main Menu");

        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
            ShowCart();
        }
        if(ch==2)
        {
            DeleteItem();
        }
        if(ch==3)
        {
            System.out.println("The Total Cost Price is:"+Total());
        }
        if(ch==4)
        {

        }



    }

    void ShowCart() {
        try {
            User user1 = new User();
            user1 = CurrentUserLoggedIn.user;
            Connection con = DBConnector.getConnection();
            Statement st = con.createStatement();
            String userName = user1.getUsername();
            String query1 = "select * from "+userName+";";
            ResultSet rs1 = st.executeQuery(query1);

            while (rs1.next()) {
                System.out.print("UserID: " + rs1.getInt(1)+"\t");
                System.out.print("ProductID: " + rs1.getInt(2)+"\t");
                System.out.print("ProductName: " + rs1.getString(3)+"\t");
                System.out.print("ProductPrice: " + rs1.getDouble(4)+"\t");
                System.out.print("Quantity: " + rs1.getString(5)+"\t");
                System.out.print("Total: " + rs1.getString(6)+"\t");
                //System.out.println("Department Name:"+rs.getString(4));
                System.out.println("\n---------------------------------\n");
            }
            System.out.println("The Total Cost Amount is "+Total()+"\n");

        } catch (SQLException e) {
            System.out.println(e);
        }
        //System.out.println("The Total Cost Amount is "+Total()+"\n");
        System.out.println("1.Show Cart\n2.Delete Cart\n3.Total\n4.Back");
        Scanner sc = new Scanner(System.in);
        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
            ShowCart();
        }
        if(ch==2)
        {
            DeleteItem();
        }
        if(ch==3)
        {
            System.out.println("The Total Cost Price is:"+Total());
        }
        if(ch==4)
        {

        }

    }

    void DeleteItem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Product ID of the item to be deleted");
        int del;
        del = sc.nextInt();
        try {
           User user1 = new User();
           user1 = CurrentUserLoggedIn.user;
           String UserName= user1.getUsername();
            Connection con = DBConnector.getConnection();
            Statement st = con.createStatement();
            String query2 = "delete from " + UserName + " where productId='" + del + "';";
            st.executeUpdate(query2);
            System.out.println("Item Deleted Successfully!");
            System.out.println("The updated Cart is:");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            ShowCart();
        } catch (SQLException e) {
            System.out.println(e);
        }

        System.out.println("1.Show Cart\n2.Delete Cart\n3.Total\n4.Main Menu");

        int ch;
        ch=sc.nextInt();
        if(ch==1)
        {
            ShowCart();
        }
        if(ch==2)
        {
            DeleteItem();
        }
        if(ch==3)
        {
            System.out.println("The Total Cost Price is:"+Total());
        }




    }
    double Total()
    {

        double total;
        double sum=0;
        try {
            User user1 = new User();
            user1=CurrentUserLoggedIn.user;
            String UserName= user1.getUsername();
            Connection con = DBConnector.getConnection();
            Statement st = con.createStatement();
            String query1 = "select * from "+UserName+";";
            ResultSet rs1 = st.executeQuery(query1);


            while (rs1.next()) {

                total=rs1.getDouble(6);

                sum=sum+total;

            }

        } catch (SQLException e) {
            System.out.println(e);
        }


        return sum;
    }
}


