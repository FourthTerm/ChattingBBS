package com.blog.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnDB {
    public static Connection conn;
    public static Connection getConnection() throws SQLException 
{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:"
                        + "3306/blog?useUnicode="
                        + "true&characterEncoding=UTF8", "root", "123456");
            } catch (SQLException ex) {
                Logger.getLogger(ConnDB.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnDB.class.getName()).log(Level.SEVERE, null, ex);
        }
          return conn;
} 
}
