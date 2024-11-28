/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

public class Items {

    private String itemName;
    private int quantity;
    private boolean needReorder;

    public Items(String itemName, int quantity) {

        this.itemName = itemName;
        this.quantity = quantity;
        this.needReorder = quantity <= 3;
    }



    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isNeedReorder() {
        return needReorder;
    }

    public void setNeedReorder(boolean needReorder) {
        this.needReorder = needReorder;
    }
    
    @Override
    public String toString() {
        return itemName + " | " + quantity + " | " + (needReorder ? "Yes" : "No");
    }

    
    
}
