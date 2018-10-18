package com.chattingbbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lan
 */
public class UserDao {
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    public boolean regUser (String username,String password,String email){
        boolean flag=false;
       try {
            conn=ConnDB.getConnection();
            String sql="insert into users(username,password,email) values(?,?,?)";
            System.out.println(sql);
            ps=conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.executeUpdate();
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
         return flag;
    }
    //关闭连接
    void close(){
            try {
                if(rs!=null){
                rs.close();
                  rs=null;
        }    
        if(ps!=null){
            ps.close();
            ps=null;
        }
        if(conn!=null){
            conn.close();
            conn=null;
        }
            } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
   }
    public boolean regUsername(String username){
         boolean flag=true;//可以注册
        try {
            conn=ConnDB.getConnection();
            String sql="select * from users where username='"+username+"'";
            System.out.println(sql);
            rs=conn.createStatement().executeQuery(sql);
            if(rs.next()){
                flag=false;//不能注册
            }
        } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        finally{
            close();
        }
        return flag;
    }
    public boolean login(String username,String password){
        boolean flag=false;
        try {
            conn=ConnDB.getConnection();
            String sql ="select * from users where username=? and password=?";
            System.out.println(sql);
            ps=conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            if(rs.next()){
                flag=true;
            }
         } catch (SQLException ex) {
                Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            }
         return flag;
    } 
        
}
