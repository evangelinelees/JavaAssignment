/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author User
 */
public class Supplier {
    private int supplierId;
    private String name;
    private String contactInfo;
    private String address;

    // Constructor
    public Supplier(int supplierId, String name, String contactInfo, String address) {
        this.supplierId = supplierId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.address = address;
    }

    // Getters
    public int getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", name='" + name + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
