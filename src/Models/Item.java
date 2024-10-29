/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author User
 */
public class Item {
    private int itemId;
    private String itemName;
    private String category;
    private int quantityInStock;
    private double pricePerUnit;
    private String description;

    // Constructor
    public Item(int itemId, String itemName, String category, int quantityInStock, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.quantityInStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
    }

 
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
        
    }

    public String getDescription() {
        return description;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }

}
