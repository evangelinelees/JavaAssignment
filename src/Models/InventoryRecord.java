/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author User
 */
import java.util.Date;

public class InventoryRecord {
    private int recordId;
    private Item item;       // Reference to the Item class
    private Supplier supplier; // Reference to the Supplier class
    private int quantityReceived;
    private Date receivedDate;

    // Constructor
    public InventoryRecord(int recordId, Item item, Supplier supplier, int quantityReceived, Date receivedDate) {
        this.recordId = recordId;
        this.item = item;
        this.supplier = supplier;
        this.quantityReceived = quantityReceived;
        this.receivedDate = receivedDate;
    }

    public InventoryRecord() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters
    public int getRecordId() {
        return recordId;
    }

    public Item getItem() {
        return item;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public int getQuantityReceived() {
        return quantityReceived;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    // Setters
    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void setQuantityReceived(int quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    @Override
    public String toString() {
        return "InventoryRecord{" +
                "recordId=" + recordId +
                ", item=" + item +
                ", supplier=" + supplier +
                ", quantityReceived=" + quantityReceived +
                ", receivedDate=" + receivedDate +
                '}';
    }
}
