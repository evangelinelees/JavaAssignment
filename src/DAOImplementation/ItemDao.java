/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplementation;

/**
 *
 * @author User
 */
import Models.Item;
import java.util.List;

public interface ItemDao {
    void addItem(Item item);
    List<Item> getAllItems(); // Retrieve all items
    void saveItem(Item item); // Save a new item to the data source
    void updateItem(Item item); // Update an existing item in the data source
    Item findById(String itemId); // Find and return an item by its ID
    List<Item> loadAll(); // Load and return all items from the data source
    void deleteItem(String itemId);
   
}
