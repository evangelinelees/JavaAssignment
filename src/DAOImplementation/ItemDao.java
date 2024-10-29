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
    void updateItem(Item item); // Update existing item
    Item getItemById(int itemId);
    List<Item> getAllItems(); // Retrieve all items
    void deleteItem(int itemId); // Optional, for item removal
}
