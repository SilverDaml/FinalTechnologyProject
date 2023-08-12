/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int vehicleId;

    @Column(name = "type")
    private String type;

    @Column(name = "make")
    private String make;

    @Column(name = "license")
    private String license;

    @Column(name = "engine_type")
    private String engineType;

    // Constructors, getters, setters, etc.

    public Vehicle(int vehicleId, String type, String make, String license, String engineType) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.make = make;
        this.license = license;
        this.engineType = engineType;
    }
    
    //Empty constructor

    public Vehicle() {
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    
    
}

