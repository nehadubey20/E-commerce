
package e.commerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Browse extends AddToCart {
    User usr;
   
    public void browse() throws SQLException
    {
        
        Scanner sc =new Scanner(System.in);
        Connection con=DBConnector.getConnection();
        
        Statement st = con.createStatement();
        String query = "Select s_no,categoryname from categories";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        
     }
    
    public void browseProducts(int pro) throws SQLException
    {
        Scanner sc =new Scanner(System.in);
        Connection con=DBConnector.getConnection();
        
        Statement st = con.createStatement();
        String query = "Select p.S_No,p.productName,p.productPrice,p.productDetails \n" +
                    "from products p,categories c\n" +
                    "where p.categoryId=c.categoryId and c.S_No='"+pro+"' ";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            System.out.println(rs.getString(1)+"  Name:  "+ rs.getString(2)+
                    "            Price: Rs."+rs.getString(3)+
                    "            Details:"+rs.getString(4));
        }
        
        con.close();
    
    
    }
        
    }



