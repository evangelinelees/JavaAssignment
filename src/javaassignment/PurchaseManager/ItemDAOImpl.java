/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.PurchaseManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javaassignment.PurchaseManager.ItemDAO;
        
/**
 *
 * @author User
 */
public class ItemDAOImpl implements ItemDAO{
    
    private final List<ItemModel> itemList = new ArrayList<>();
    private final String FILE_PATH = "C:\\OODJ assignment\\JavaAssignment\\src\\javaassignment\\PurchaseManager\\item.txt";
    
    public List<ItemModel> getAllItems() {
        List<ItemModel> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) { // Check if all required fields are present
                    ItemModel item = new ItemModel();
                    item.setItemID(parts[0]);
                    item.setItemName(parts[1]);
                    item.setDescription(parts[2]);
                    item.setQuantity(Integer.parseInt(parts[3]));
                    item.setPrice(Double.parseDouble(parts[4]));
                    items.add(item); // Add the item to the list
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Log any exceptions
        }
        return items; // Return the list of items
    }
    
    public List<ItemModel> loadAll() {
        List<ItemModel> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(stringToItem(line));
            }
            
        } catch (IOException e) {
            e.printStackTrace(); 
        }
        
        return items; 
    }
    private ItemModel stringToItem(String line) {
    String[] parts = line.split(",");
    if (parts.length != 5) {
        throw new IllegalArgumentException("Invalid item data format: " + line);
    }
 
    String itemId = parts[0];
    String itemName = parts[1];
    String description = parts[2];
    int quantity;
    double price;

    try {
        quantity = Integer.parseInt(parts[3]);
        price = Double.parseDouble(parts[4]);
    } catch (NumberFormatException e) {
        throw new IllegalArgumentException("Invalid number format in line: " + line, e);
    }

    return new ItemModel(itemId, itemName, description, quantity, price);
    }

    @Override
    public List<ItemModel> loadAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
