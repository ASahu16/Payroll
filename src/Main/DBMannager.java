package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AGYAT
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBMannager {
    
    Connection con;
    public static Connection ConnectDatabase(){
        try
            {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=PayrollDB; user=payroll; password=root;");
            return con;
             }
            catch(ClassNotFoundException | SQLException e)
            {
               JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
}
