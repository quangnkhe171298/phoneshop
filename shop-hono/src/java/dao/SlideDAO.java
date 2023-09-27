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
import model.Slide;

/**
 *
 * @author Admin
 */
public class SlideDAO extends DBContext {

    public ArrayList<Slide> getAllSlide() {
        ArrayList<Slide> bloList = new ArrayList<>();
        try {
            String sql = "select top 4 title, img, description, backlink from slide";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Slide b = new Slide(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                bloList.add(b);
            }
        } catch (SQLException e) {
        }
        return bloList;
    }


}



