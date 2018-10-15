package com.blog.dao;

import com.blog.model.Article;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lan
 */
public class ArticleDao {
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    public boolean addArticle(String username,String title,String content,String date){
        boolean flag=false;
        try {
            conn=ConnDB.getConnection();
            String sql="insert into articles(username,title,content,date) values(?,?,?,?)";
            System.out.print(sql);
            ps=conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, title);
            ps.setString(3, content);
            ps.setString(4, date);
            ps.executeUpdate();
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
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
                Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
        public boolean deleteArticle (String aid){
        boolean flag=false;
        try {
            conn=ConnDB.getConnection();
            String sql="delete from articles where aid=?";
            System.out.println(sql);
            ps=conn.prepareStatement(sql);
            ps.setString(1, aid);
            ps.executeUpdate();
            String sql2="delete from replys where aid=?";
            ps=conn.prepareStatement(sql2);
            ps.setString(1, aid);
            ps.executeUpdate();
            flag=true;
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
   public ArrayList getArticleByPage(int pageSize,int currentPage,String username){
            ArrayList al=new ArrayList();
            try {
            conn=ConnDB.getConnection();
            String sql = "select* from articles where username='"+username+"'"
                    +"order by aid desc limit "+pageSize*(currentPage-1)+","+ pageSize;
            System.out.println(sql);
            rs=conn.createStatement().executeQuery(sql);
            while(rs.next()){
                Article article =new Article();
                article.setAid(rs.getInt(1));
                article.setUsername(rs.getString(2));
                article.setTitle(rs.getString(3));
                article.setContent(rs.getString(4));
                article.setDate(rs.getString(5));
                al.add(article);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return al;
       }
        public int getRowCount(){ //获得article 的总行数
            int rowCount=0;
            try {
            conn=ConnDB.getConnection();
            String sql ="select count(username) from articles";
            System.out.println(sql);
            rs=conn.createStatement().executeQuery(sql);
            if(rs.next())
                rowCount=rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return rowCount;
        }
        public Article getArticleById(String aid){
            Article article=new Article();
            try {
            String sql="select * from articles where aid=" +aid;
            System.out.println(sql);
            conn=ConnDB.getConnection();
            rs=conn.createStatement().executeQuery(sql);
            if(rs.next()){
                article.setAid(rs.getInt(1));
                article.setUsername(rs.getString(2));
                article.setTitle(rs.getString(3));
                article.setContent(rs.getString(4));
                article.setDate(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArticleDao.class.getName()).log(Level.SEVERE, null, ex);
        }
            return article;
        }
}

