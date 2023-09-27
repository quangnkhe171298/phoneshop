/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import model.Blog;

/**
 *
 * @author Admin
 */
public class BlogDAO extends DBContext {

    public ArrayList<Blog> getRecentPost() {
        ArrayList<Blog> bloList = new ArrayList<>();
        try {
            String sql = "select top 5 blog_title,substring(description,0,70),img,blog_id from blog order by post_date desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                bloList.add(b);
            }
        } catch (SQLException e) {
        }
        return bloList;
    }

    public ArrayList<Blog> getHotPost() {
        ArrayList<Blog> bloList = new ArrayList<>();
        try {
            String sql = "select top 6 blog_title, substring(description,0,70), img, blog_id from blog order by views desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Blog b = new Blog(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                bloList.add(b);
            }
        } catch (SQLException e) {
        }
        return bloList;
    }

    
}
