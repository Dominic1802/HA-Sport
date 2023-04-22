/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author 84868
 */
public class ProductDAO extends DBContext{
    PreparedStatement ps;
    ResultSet rs;
    
    public Product getProductById(int id) {
        String sql = "select * from products where proId=" + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDate(6),
                        rs.getString(8),
                        (new CategoryDAO()).getCategoryById(rs.getInt(7)),
                        rs.getInt(9), rs.getInt(10));
                return product;

            }
        } catch (SQLException e) {
        }
        return null;
    }
    
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from Products";
        try {

            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Product product = new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getDate(6),
                        rs.getString(8),
                        (new CategoryDAO()).getCategoryById(rs.getInt(7)),
                        rs.getInt(9), rs.getInt(10));
                list.add(product);

            }
        } catch (Exception e) {
        }
        return list;
    }
}
