/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components.ItemInput;

import Models.Item;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ItemInputPanel extends JPanel {

    private JTable table;
    private DefaultTableModel tableModel;

    public ItemInputPanel() {
        tableModel = new DefaultTableModel(new Object[]{"Item ID", "Item Name", "Description", "Quantity", "Price"}, 0);
        table = new JTable(tableModel);
        initComponents();
    }

    private void initComponents() {
        // Define column names
        String[] columnNames = {"Item ID", "Item Name", "Description", "Quantity", "Price"};

        // Create the table model and JTable
        tableModel = new DefaultTableModel(columnNames, 0); // 0 rows initially
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true); // Ensure the table fills the view

        // Add JScrollPane for the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 200)); // Set preferred size for the table

        // Set the layout and add the scroll pane to the panel
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    }

    // Method to add a new item to the table
    public void addItem(String itemId, String itemName, String description, String quantity, String price) {
        tableModel.addRow(new Object[]{itemId, itemName, description, quantity, price});
    }

    // Optional: Method to clear the table
    public void clearItems() {
        tableModel.setRowCount(0); // Clear all rows
    }
    
   
    public void populateItems(List<Item> items) {
        tableModel.setRowCount(0); // Clear existing rows
        for (Item item : items) {
            tableModel.addRow(new Object[]{
                item.getItemId(),
                item.getItemName(),
                item.getDescription(),
                item.getQuantity(),
                item.getPrice()
            });
        }
    }
    
   
}

