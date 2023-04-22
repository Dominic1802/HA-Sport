package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Category;

public class CategoryDAO extends DBContext {

    PreparedStatement ps;
    ResultSet rs;

    public Category getCategoryById(int id) {
        String sql = "select * from categories where catId = " + id;
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                Category category = new Category(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                return category;
            }
        } catch (SQLException e) {
        }
        return null;
    }
}
