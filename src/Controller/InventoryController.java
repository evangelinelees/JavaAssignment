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
        Item item = new Item();
        item.setItemId(itemId);
        item.setItemName(itemName);
        item.setDescription(description);
        item.setQuantity(quantity);
        item.setPrice(price);
        inventoryService.addItem(item);
    }

    public List<Item> getAllItems() {
        return inventoryService.getAllItems();
    }
}