/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.CategoryDAO;
import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Product;

/**
 *
 * @author 84868
 */
public class ShopAllServlet extends HttpServlet {

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
            out.println("<title>Servlet ShopAllServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ShopAllServlet at " + request.getContextPath() + "</h1>");
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
        //get sort by
        int sortby = 1;
        if (null != request.getParameter("sort")) {
            sortby = Integer.parseInt(request.getParameter("sort"));
        }
        switch (sortby) {
            case 1: {
                request.setAttribute("sortname", "selected");
                break;
            }
            case 2: {
                request.setAttribute("sortasc", "selected");
                break;
            }
            case 3: {
                request.setAttribute("sortdesc", "selected");
                break;
            }
            default: {
                request.setAttribute("sortnew", "selected");
                break;
            }
        }
        request.setAttribute("sortabc", sortby);

        //get search by name
        String name = "";
        if (request.getParameter("search") != null) {
            name = request.getParameter("search").trim();

        }
        request.setAttribute("searchname", name);

        //get selected cartegory
        int catCheck = 0;
        if (null != request.getParameter("category")) {
            catCheck = Integer.parseInt(request.getParameter("category"));
        }
        request.setAttribute("category", catCheck);
        
        //get price range
        int beginprice = 0;
        int endprice = 0;
        if (request.getParameter("beginp") != null && !"".equals(request.getParameter("beginp"))) {
            beginprice = Integer.parseInt(request.getParameter("beginp"));
            request.setAttribute("beginprice", beginprice);
        }
        if (request.getParameter("endp") != null && !"".equals(request.getParameter("endp"))) {
            endprice = Integer.parseInt(request.getParameter("endp"));
            request.setAttribute("endprice", endprice);
        }

        //DAO
        ProductDAO pdao = new ProductDAO();
        CategoryDAO cdao = new CategoryDAO();
        
        //load cartegory
        List<Category> categories = new ArrayList<>();
        Category all = new Category();
        all.setCatId(0);
        all.setCatName("All");
        categories.add(all);
        for (Category cat : cdao.getAllCategory()) {
            categories.add(cat);
        }
        request.setAttribute("categories", categories);

        //get and pagecount
        int pagecount = pdao.getPageCount(catCheck, beginprice, endprice, name);
        request.setAttribute("numberPage", pagecount);
        //get and set curent page
        int page = 1;
        if (null != request.getParameter("page")) {
            page = Integer.parseInt(request.getParameter("page"));
        }
        request.setAttribute("pageCurrent", page);
        //paging calculation
        int beginPage = page - 1;
        int endPage = page + 1;
        if (page < 3) {
            beginPage = 1;
            endPage = 3;
            if (endPage > pagecount) {
                endPage = pagecount;
            }
        } else {
            if (page > pagecount - 2) {
                endPage = pagecount;
                beginPage = pagecount - 2;
            }
        }
        List<Product> products = pdao.getAllProductByConstrain(page - 1, sortby, catCheck, beginprice, endprice, name);
        request.setAttribute("beginPage", beginPage);
        request.setAttribute("endPage", endPage);
        request.setAttribute("lstzsize", products.size() - 1);
        request.setAttribute("listP", products);
        request.getRequestDispatcher("All-Product.jsp").forward(request, response);     
    }


    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
