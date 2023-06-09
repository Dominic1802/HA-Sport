package dal;
/**
 *
 * @author 84868
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;

public class CategoryDAO extends DBContext {

    PreparedStatement ps;
    ResultSet rs;

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();

        try {
            String sql = "select * from Categories";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(category);
            }
        } catch (SQLException e) {
        }
        return list;
    }

//    public void createCategory(Category category) {
//        String sql = "insert into Categories values(?,?,?)";
//        try {
//            ps = connection.prepareStatement(sql);
//            ps.setString(1, category.getCatName());
//            ps.setString(2, category.getCatImage());
//            ps.setString(3, category.getCatDes());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//        }
//    }
    public void createCategory(Category category) {
    String sql = "INSERT INTO Categories (catName,catImage,catDes) VALUES (?,?,?)";
    try {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, category.getCatName());
        ps.setString(2, category.getCatImage());
        ps.setString(3, category.getCatDes());
        ps.executeUpdate();
        ps.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public void updateCategory(Category category){
        String sql = "update Categories\n"
                + " set catName = '" + category.getCatName()
               
                + "', catDes = '" + category.getCatDes()
                
                + "' where catId = " + category.getCatId();
        try {
            System.out.println("sql : "+ sql);
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    
 public void deleteProductCatId(int id) {
        String sql = "delete from Products where catId = " + id;
        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }
    public void deleteCategory(int id) {
        String sql = "delete from Categories where catId = " + id;
        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public Category getCategoryById(int id)
    {
        String sql = "select * from Categories where catId = "+id;
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
