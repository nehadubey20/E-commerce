/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerce;

/**
 *
 * @author Tahniya
 */
public class Orders {
    
    User usr2=new User();
    public void orderDetails()
    {
        try
        {
            String query = "insert into orders(userid, username,email,contact,address, productID,prodName,prodQty) values (?,?,?,?,?,?,?,?)";
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
                
    }
    public void viewOrderHistory()
    {
        
    }
}
