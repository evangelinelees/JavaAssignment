/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import DAOImplementation.ItemDao;
import Models.Item;
import java.util.List;

/**
 *
 * @author User
 */
public class DataHandling {
    private ItemDao itemDao; 
    
    public DataHandling(ItemDao itemDAO) {
        this.itemDao = itemDAO; 
    }    
    public boolean validateItemId(String itemId) {
        itemId = itemId.trim();
        return itemId.matches("I\\d{4}");
    }

    public boolean validateQuantity(String quantityText) {
        quantityText = quantityText.trim();
        try {
            int quantity = Integer.parseInt(quantityText);
            return quantity >= 0; // Quantity must be non-negative
        } catch (NumberFormatException e) {
            return false; // Invalid number
        }
    }

    public boolean validatePrice(String priceText) {
        priceText = priceText.trim();
        try {
            double price = Double.parseDouble(priceText);
            return price >= 0; // Price must be non-negative
        } catch (NumberFormatException e) {
            return false; // Invalid number
        }
    }
    
    public boolean isItemIdExists(String itemId) {
        List<Item> items = itemDao.loadAll(); // Load all items from the data source
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                return true; // Item ID exists
            }
        }
        return false; // Item ID does not exist
    }
}

