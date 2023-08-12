/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Booking_id")
    private int bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
    
    @Column(name = "customer_firstName")
    private String customerFName;
    
    @Column(name = "customer_lastName")
    private String customerLName;
    
    @Column(name = "customer_mobileNumber")
    private String customerMNumber;
    
    @Column(name = "vehicle_type")
    private String vehicleType;
    
    @Column(name = "vehicle_make")
    private String vehicleMake;
    
    @Column(name = "vehicle_licence")
    private String vehicleLicence;
    
    @Column(name = "engine_type")
    private String engineType;
    
    @Column(name = "booking_type")
    private String bookingType;

    @Column(name = "booking_date")
    @Temporal(TemporalType.DATE)
    private Date date;


    @Column(name = "comments")
    private String comments;

    

    

    // Constructors, getters, setters, etc.
    public Booking(int bookingId, Customer customer, Vehicle vehicle, String customerFName, String customerLName, String customerMNumber, String vehicleType, String vehicleMake, String vehicleLicence, String engineType, String bookingType, Date date, String comments) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.vehicle = vehicle;
        this.customerFName = customerFName;
        this.customerLName = customerLName;
        this.customerMNumber = customerMNumber;
        this.vehicleType = vehicleType;
        this.vehicleMake = vehicleMake;
        this.vehicleLicence = vehicleLicence;
        this.engineType = engineType;
        this.bookingType = bookingType;
        this.date = date;
        this.comments = comments;
    }

    //Empty constructor
    public Booking() {
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getCustomerFName() {
        return customerFName;
    }

    public void setCustomerFName(String customerFName) {
        this.customerFName = customerFName;
    }

    public String getCustomerLName() {
        return customerLName;
    }

    public void setCustomerLName(String customerLName) {
        this.customerLName = customerLName;
    }

    public String getCustomerMNumber() {
        return customerMNumber;
    }

    public void setCustomerMNumber(String customerMNumber) {
        this.customerMNumber = customerMNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleLicence() {
        return vehicleLicence;
    }

    public void setVehicleLicence(String vehicleLicence) {
        this.vehicleLicence = vehicleLicence;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

   

    
    
    
    
    
}

