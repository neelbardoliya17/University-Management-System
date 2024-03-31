package UniversityManagementSystem;


import java.sql.*;

public class Conn {

    /* 5 Steps to connect java with database
        1.register the driver class
        2.Creating connection string
        3.creating statement
        4.executing mysql queries
        5.closing the connection
    */
    Connection c;
    Statement s;
    Conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem","root","");//connection estblishment with connection string
            s=c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
