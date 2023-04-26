/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AccountDAO;
import extension.Extension;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;

/**
 *
 * @author 84868
 */
@WebServlet(name = "SignUp", urlPatterns = {"/signup"})
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("SignUp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String Repassword = request.getParameter("Repassword");
        String fullName = request.getParameter("fullName");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        AccountDAO dao = new AccountDAO();
        Account user = dao.getAccountByName(username);
        if (password.equals(Repassword) && user == null) {
            String hashPass = "";
            try {
                hashPass = Extension.generateHash(password);

            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            Account account = new Account(1, username, hashPass, false, 0, null, null, null, null);
            dao.createAccount(account);
            HttpSession session = request.getSession();
            account = dao.getAccountByName(account.getAccountName());
            session.setAttribute("accountsession", account);
            response.sendRedirect("home");
            return;
        }

        if (password.equals(Repassword) == false) {
            request.setAttribute("errorAccount", "Password and Rewrite Password don't match!");
        }
        if (user != null) {
            request.setAttribute("errorAccount", "Account already existed!");
        }
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("Repassword", Repassword);
        request.getRequestDispatcher("SignUp.jsp").forward(request, response);
    }

}
