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
import model.Product;


/**
 *
 * @author Admin
 */
public class ProductDAO extends DBContext {
    
     public ArrayList<Product> getFearturedProduct() {
        ArrayList<Product> proList = new ArrayList<>();
        try {
            String sql = "select top 8 product_id, title, sale_price, price, img from product order by create_date desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getString(5));
                proList.add(p);
            }
        } catch (Exception e) {
        }
        return proList;
    }

    

}
