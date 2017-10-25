package koneksi;
import java.sql.*;
public class db_form {
    public Connection cc;
    public Statement ss;
    public ResultSet rs;
    
public void Class () {
    try { 
        Class.forName("com.mysql.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/awb","root","root");
        System.out.println("Koneksi OK!!");
        
    }  catch (Exception e) {
        System.out.println(e);
    }
}

public Connection getConnection() {
        return cc;
    }

       
}
