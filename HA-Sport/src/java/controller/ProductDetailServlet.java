/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.OrderDAO;
import dal.OrderDetailDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import model.Account;
import model.Order;
import model.Product;

/**
 *
 * @author 84868
 */
public class ProductDetailServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductDetailServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductDetailServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("productid"));
        ProductDAO dao = new ProductDAO();
        Product product = dao.getProductById(id);
        List<Product> viewProduct = dao.getTopView();
        request.setAttribute("viewProduct", viewProduct);
        request.setAttribute("product", product);
        request.getRequestDispatcher("Product-Detail.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        if (session.getAttribute("accountsession") == null) {
            response.sendRedirect("login");
            return;
        }
        Account account = (Account) session.getAttribute("accountsession");
        OrderDAO orderDAO = new OrderDAO();
        Order order = orderDAO.getCurrentCart(account.getAccountId());
        if (order == null) {
            orderDAO.createCart(account);
            order = orderDAO.getCurrentCart(account.getAccountId());
        }
        int id = Integer.parseInt(request.getParameter("id"));
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        Product product = checkExist(order.getProIds(), id);
        if(product==null)
        {
            product= (new ProductDAO()).getProductById(id);
            product.setProQuantity(1);
            orderDetailDAO.createProductCart(order.getOrderId(), product);
        }
        else
        {
            product.setProQuantity(product.getProQuantity()+1);
            orderDetailDAO.updateProductCart(order.getOrderId(), product);
        }
        response.sendRedirect("cart");
    }
    
    private Product checkExist(List<Product> list, int id)
    {
        for(Product pd : list)
        {
            if(pd.getProId()== id) return pd;
        }
        return null;
    }
}
