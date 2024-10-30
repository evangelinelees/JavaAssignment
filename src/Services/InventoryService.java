package Services;


import DAOImplementation.InventoryRecordDao;
import DAOImplementation.InventoryRecordDaoImpl;
import DAOImplementation.ItemDao;
import DAOImplementation.ItemDaoImpl;
import Models.Item;
import java.util.List;


public class InventoryService {
    private final ItemDao itemDao = new ItemDaoImpl();
    
    public void addItem(Item item) {
        itemDao.addItem(item);
    }

    public List<Item> getAllItems() {
        return itemDao.getAllItems();
    }
    public void saveItem(Item item) {
        // Business logic to prevent saving if certain conditions aren't met
        if (item.getQuantity() < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        
        // If item already exists, update it
        Item existingItem = itemDao.findById(item.getItemId());
        if (existingItem != null) {
            // Example: Increment quantity if the item already exists
            existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
            existingItem.setPrice(item.getPrice()); // Update price if necessary
            itemDao.updateItem(existingItem); // Update the existing item
        } else {
            // Create new item entry
            itemDao.saveItem(item); // Save the new item
        }
    }
    
    public void updateItem(String itemId, String itemName, String description, int quantity, double price) {
        Item item = new Item(itemId, itemName, description, quantity, price); // Create new Item object
        itemDao.updateItem(item); // Delegate to DAO
    }
}