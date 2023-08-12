
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.LogicController;



@WebServlet(name = "SvUsers", urlPatterns = {"/SvUsers"})
public class SvUsers extends HttpServlet {

    
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
        
        String first_Name = request.getParameter("first_Name");
        String last_Name = request.getParameter("last_Name");
        String email = request.getParameter("user_Email");
        String password = request.getParameter("user_Password");
        
        System.out.println("User's name is " + first_Name + last_Name);
        System.out.println("User's email is " + email);
        System.out.println("User's name is " + password);
        
        //Creates a new user and takes its attributes from theHTML form
        logcon.createUser(first_Name, last_Name, email, password);
        
        response.sendRedirect("blank.jsp");
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
