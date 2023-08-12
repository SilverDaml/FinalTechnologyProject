/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.LogicController;

/**
 *
 * @author cardo
 */
@WebServlet(name = "SvBookings", urlPatterns = {"/SvBookings"})
public class SvBookings extends HttpServlet {

   
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
        String mobile_number = request.getParameter("mobile_number");
        String vehicle_Type = request.getParameter("vehicle_Type");
        String vehicle_Make = request.getParameter("vehicle_Make");
        String vehicle_Licence = request.getParameter("vehicle_Licence");
        String engine_Type = request.getParameter("engineType");
        String booking_Type = request.getParameter("bookingType");
        
        
        String dateString = request.getParameter("date"); // Get the date as a string from the form

        Date date = null; // Initialize the date variable

        try {
            // Assuming the date format from the front end is "dd/MM/yyyy"
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = dateFormat.parse(dateString); // Parse directly to java.util.Date
        } catch (ParseException e) {
            // Handle the case where the date string is not in the correct format
            System.out.println("Could notconvert text to Date");
            // You may want to display an error message or take appropriate action.
        }

 
        
        String comments = request.getParameter("comments");
        
        
        
        //Creates a new user and takes its attributes from the HTML form
        logcon.createBooking(first_Name, last_Name, mobile_number, vehicle_Type, vehicle_Make, vehicle_Licence, engine_Type, booking_Type, date, comments );
        
        response.sendRedirect("blank.jsp");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
