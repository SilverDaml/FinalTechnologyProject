/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logic.LogicController;

/**
 *
 * @author cardo
 */
@WebServlet(name = "SvAdmin", urlPatterns = {"/SvAdmin"})
public class SvAdmin extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    LogicController logcon = new LogicController();

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       String email = request.getParameter("email");
       String password = request.getParameter("password");

    // Provided email and password are checked against the database.
    // For the sake of testing, credentials are hardcoded.
        String gerEmail = "gersmith@gmail.com";
        String gerPassword = "ger1234";

        if (email.equals(gerEmail) && password.equals(gerPassword)) {
            HttpSession session = request.getSession();
            session.setAttribute("loggedIn", true);
            response.sendRedirect("admin.jsp");
        } else {
            response.sendRedirect("login.jsp?error=1");
        }

        }
    
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
