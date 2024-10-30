package DAOImplementation;

import DAOImplementation.ItemDao;
import Models.Item;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    private List<Item> itemList = new ArrayList<>();
    private final String FILE_PATH = "C:\\JAVA\\JavaAssignment\\src\\Databases\\inventoryData.txt";

    
    public void addItem(Item item) {
        // Add item to the list
        itemList.add(item);
        
        // Write item to the file
        writeToFile(item);
    }
    
    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) { // Check if all required fields are present
                    Item item = new Item();
                    item.setItemId(parts[0]);
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

    public Item getItemById(String itemId) {
        for (Item item : itemList) {
            if (item.getItemId() == itemId) { // Updated method
                return item;
            }
        }
        return null; // Return null if not found
    }

   @Override
    public void save(Item item) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JAVA\\JavaAssignment\\src\\Databases\\inventoryData.txt", true))) {
            writer.write(itemToString(item));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace(); // Handle file writing exceptions
        }
    }
    
    public void deleteItem(String itemId) {
        itemList.removeIf(item -> item.getItemId() == itemId); // Updated method
    }

    @Override
    public void update(Item item) {
        List<Item> items = loadAll(); // Load all items to update
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JAVA\\JavaAssignment\\src\\Databases\\inventoryData.txt"))) {
            for (Item currentItem : items) {
                if (currentItem.getItemId().equals(item.getItemId())) {
                    // Write the updated item instead of the old one
                    writer.write(itemToString(item));
                } else {
                    // Write the existing item back to the file
                    writer.write(itemToString(currentItem));
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle file writing exceptions
        }
    }
    
    public Item findById(String itemId) {
        List<Item> items = loadAll(); // Load all items to find the specific one
        for (Item item : items) {
            if (item.getItemId().equals(itemId)) {
                return item; // Return the found item
            }
        }
        return null; // Return null if the item is not found
    }
    
    public List<Item> loadAll() {
        List<Item> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\JAVA\\JavaAssignment\\src\\Databases\\inventoryData.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(stringToItem(line));
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle file reading exceptions
        }
        return items; // Return the list of items
    }
    
    private String itemToString(Item item) {
        return String.join(",", item.getItemId(), item.getItemName(), item.getDescription(),
                String.valueOf(item.getQuantity()), String.valueOf(item.getPrice()));
    }
    
    private void writeToFile(Item item) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String line = String.format("%s,%s,%s,%d,%.2f", item.getItemId(), item.getItemName(),
                                         item.getDescription(), item.getQuantity(),
                                         item.getPrice());
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Item stringToItem(String line) {
        String[] parts = line.split(",");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Invalid item data format: " + line);
        }
        String itemId = parts[0];
        String itemName = parts[1];
        String description = parts[2];
        int quantity = Integer.parseInt(parts[3]);
        double price = Double.parseDouble(parts[4]);
        return new Item(itemId, itemName, description, quantity, price); // Adjust constructor as per your Item class
    }

    @Override
    public void delete(String itemId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
