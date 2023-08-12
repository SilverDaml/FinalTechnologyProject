/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Date;
import persistence.PersistenceController;

/**
 *
 * @author cardo
 */
public class LogicController {
    
    PersistenceController persCon = new PersistenceController();
    
    //Method to create a new user
    public void createUser (String fname, String lname, String email, String password) {
        
        //new user object
        User user = new User();
        //setting user's attributes
        user.setFname(fname);
        user.setLname(lname);
        user.setEmail(email);
        user.setPassword(password);
        
        
        persCon.createUser(user);
    }
    
    public void createBooking (String fname, String lname, String mobile_number, String vehicle_Type, String vehicle_Make,String vehicle_Licence,
            String engine_Type,String booking_Type,Date date,String comments) {
        
        //new user object
        Booking booking = new Booking();
        //setting user's attributes
        booking.setCustomerFName(fname);
        booking.setCustomerLName(lname);
        booking.setCustomerMNumber(mobile_number);
        booking.setVehicleType(vehicle_Type);
        booking.setVehicleMake(vehicle_Make);
        booking.setVehicleLicence(vehicle_Licence);
        booking.setEngineType(engine_Type);
        booking.setBookingType(booking_Type);
        booking.setDate(date);
        booking.setComments(comments);
        
        
        persCon.createBooking(booking);
    }
    
    //Method to create a new admin
    public void createAdmin (String email, String password) {
        
        //new admin object
        Admin admin = new Admin();
        //setting admin's attributes
        admin.setEmail("gersmith@gmail.com");
        admin.setPassword("ger1234");
        
        
        persCon.createAdmin(admin);
    }
    

}
