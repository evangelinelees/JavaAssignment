/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author User
 */
 import java.io.Serializable;

public class Item implements Serializable{   //ftwwwwwwww future implentation for byte array <3 <3
    private String itemId;
    private String itemName;
    private String description;
    private int quantity;
    private double price;

    
    public Item() {
        
    }

    // Parameterized constructor
    public Item(String itemId, String itemName, String description, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

 
    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }


    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantityInStock=" + quantity +
                ", pricePerUnit=" + price +
                '}';
    }
}
