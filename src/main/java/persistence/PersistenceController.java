/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.util.List;
import logic.Admin;
import logic.Booking;
import logic.Customer;
import logic.Invoice;
import logic.Part;
import logic.User;

/**
 *
 * @author cardo
 */
public class PersistenceController {
    
    UserJpaController userJpa = new UserJpaController();
    BookingJpaController bookingJpa = new BookingJpaController(); 
    PartJpaController partJpa = new PartJpaController(); 
    InvoiceJpaController invoiceJpa = new InvoiceJpaController();
    VehicleJpaController vehicleJpa = new VehicleJpaController();
    AdminJpaController adminJpa = new AdminJpaController(); 
    
    //Method to create a new user
    public void createUser(User user) {
      
        userJpa.create(user);
    }
    
    // Add similar methods for creating/updating/deleting Booking, Part, and Invoice entities
    // Example:
    public void createBooking(Booking booking) {
        bookingJpa.create(booking);
    }
    
    //Method to create a new admin
    public void createAdmin(Admin admin) {
      
        adminJpa.create(admin);
    }
    
    
    
    

    public void createPart(Part part) {
        partJpa.create(part);
    }

    public void createInvoice(Invoice invoice) {
        invoiceJpa.create(invoice);
    }
    
    public List<Booking> getAllBookings() {
        return bookingJpa.findBookingEntities();
    }

    public List<Part> getAllParts() {
        return partJpa.findPartEntities();
    }

    public List<Invoice> getAllInvoices() {
        return invoiceJpa.findInvoiceEntities();
    }
}
