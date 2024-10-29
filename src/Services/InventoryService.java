/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author User
 */
import DAOImplementation.InventoryRecordDao;
import DAOImplementation.InventoryRecordDaoImpl;
import DAOImplementation.ItemDao;
import DAOImplementation.ItemDaoImpl;
import Models.InventoryRecord;
import Models.Item;
import Models.Supplier;
import java.util.Date;
import java.util.List;

public class InventoryService {
//    private final ItemDao itemDao = new ItemDaoImpl();
//    private final InventoryRecordDao inventoryRecordDao = new InventoryRecordDaoImpl();
//
//    /**
//     * Receives stock for an item from a supplier and updates the stock level.
//     * Also, records the transaction as an inventory record.
//     */
//    public void receiveStock(Item item, Supplier supplier, int quantity) {
//        if (item == null || supplier == null || quantity <= 0) {
//            throw new IllegalArgumentException("Invalid item, supplier, or quantity");
//        }
//
//        // Update stock level for the item
//        int updatedQuantity = item.getQuantityInStock() + quantity;
//        item.setQuantityInStock(updatedQuantity);
//        itemDao.updateItem(item);
//
//        // Create an inventory record
//        InventoryRecord record = new InventoryRecord();
//        record.setItem(item);
//        record.setSupplier(supplier);
//        record.setQuantityReceived(quantity);
//        record.setReceivedDate(new Date());
//
//        // Add the inventory record to the database
//        inventoryRecordDao.addInventoryRecord(record);
//    }
//
//    /**
//     * Updates the stock level of an item to a specified new quantity.
//     */
//    public void updateStockLevel(int itemId, int newQuantity) {
//        if (newQuantity < 0) {
//            throw new IllegalArgumentException("Quantity cannot be negative");
//        }
//
//        // Retrieve the item, update the stock quantity, and save changes
//        Item item = itemDao.getItemById(itemId);
//        if (item != null) {
//            item.setQuantityInStock(newQuantity);
//            itemDao.updateItem(item);
//        } else {
//            System.out.println("Item with ID " + itemId + " not found.");
//        }
//    }
//
//    /**
//     * Generates a report of all inventory records.
//     * 
//     * @return List of InventoryRecord objects representing the inventory report.
//     */
//    public List<InventoryRecord> generateInventoryReport() {
//        // Retrieve all inventory records from the database
//        return inventoryRecordDao.getAllInventoryRecords();
//    }
}
