/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

/**
 *
 * @author User
 */
public class DataHandling {
    
    public boolean validateItemId(String itemId) {
        // Item ID should start with 'I' followed by 4 digits
        return itemId.matches("I\\d{4}");
    }

    public boolean validateQuantity(String quantityText) {
        try {
            int quantity = Integer.parseInt(quantityText);
            return quantity >= 0; // Quantity must be non-negative
        } catch (NumberFormatException e) {
            return false; // Invalid number
        }
    }

    public boolean validatePrice(String priceText) {
        try {
            double price = Double.parseDouble(priceText);
            return price >= 0; // Price must be non-negative
        } catch (NumberFormatException e) {
            return false; // Invalid number
        }
    }
}

