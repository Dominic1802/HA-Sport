package model;

/**
 *
 * @author 84868
 */
public class Account {
    private int accountId;
    private String accountName;
    private String accountPass;
    private boolean isAdmin;
    private double cash;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    public Account() {
    }

    public Account(int accountId, String accountName, String accountPass, boolean isAdmin, double cash, String fullName, String phone, String email, String address) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountPass = accountPass;
        this.isAdmin = isAdmin;
        this.cash = cash;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPass() {
        return accountPass;
    }

    public void setAccountPass(String accountPass) {
        this.accountPass = accountPass;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
}
