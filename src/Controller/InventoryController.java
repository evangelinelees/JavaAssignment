/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Models.Item;
import Services.InventoryService;
import java.util.List;

public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController() {
        this.inventoryService = new InventoryService();
    }

    public void saveItem(String itemId, String itemName, String description, int quantity, double price) {
        Item newItem = new Item(itemId, itemName, description, quantity, price);
        inventoryService.addItem(newItem);
    }

    public List<Item> getAllItems() {
        return inventoryService.getAllItems();
    }
    
    public void updateItem(String itemId, String itemName, String description, int quantity, double price) {
        inventoryService.updateItem(itemId, itemName, description, quantity, price);
    }
    
}