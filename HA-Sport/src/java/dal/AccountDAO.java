/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;

/**
 *
 * @author 84868
 */
public class AccountDAO extends DBContext {

    PreparedStatement ps;
    ResultSet rs;

    public Account getAccountById(int id) {
        try {
            String sql = "select * from Accounts where accountId = ?";
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                return account;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public Account getAccountByName(String name) {
        if (name != null && !name.equals("")) {
            String sql = "select * from Accounts where accountName = '" + name + "'";
            try {
                ps = connection.prepareStatement(sql);
//                ps.setString(1, name);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
                    return account;
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return null;
    }

    public void updatePassword(int id, String password) {
        String sql = "update Accounts \n"
                + "set accountPass = '" + password + "' "
                + "where accountId = " + id;
        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException e) {

        }
    }
    public void createAccount(Account account) {
        String sql = "insert into Accounts values(?,?,?,0,null,null,null,null)";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, account.getAccountName());
            ps.setString(2, account.getAccountPass());
            ps.setBoolean(3, account.isIsAdmin());
            System.out.println("aaaaaaaaaaa");
            ps.executeUpdate();
            System.out.println("sql: " + sql );
        } catch (SQLException e) {

        }
    }
}
