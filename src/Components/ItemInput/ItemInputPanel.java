/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components.ItemInput;

import Components.GlobalComponents.ScrollBarWin11UI;
import Components.ItemInput.UniversalButton;
import Models.Item;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;


public class ItemInputPanel extends JPanel {

    private JTable table;
    private DefaultTableModel tableModel;
     private JTable itemTable;
     
    public ItemInputPanel() {
        tableModel = new DefaultTableModel(new Object[]{"Item ID", "Item Name", "Description", "Quantity", "Price"}, 0);
        table = new JTable(tableModel);
        initComponents();
    }

    private void initComponents() {
        String[] columnNames = {"Item ID", "Item Name", "Description", "Quantity", "Price"};

        // Create the table model and JTable
        tableModel = new DefaultTableModel(columnNames, 0); // Initialize with no rows
        table = new JTable(tableModel);
        table.setFillsViewportHeight(true); // Ensure the table fills the viewport height

        // Add JScrollPane for the JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(400, 200)); // Set preferred size for the table

        // Set custom scrollbar UI
        scrollPane.getVerticalScrollBar().setUI(new ScrollBarWin11UI());
        scrollPane.getHorizontalScrollBar().setUI(new ScrollBarWin11UI());

        // Set the layout and add the scroll pane to the panel
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
    
    }

    
    public void addItem(String itemId, String itemName, String description, String quantity, String price) {
        tableModel.addRow(new Object[]{itemId, itemName, description, quantity, price});
    }

    public void clearItems() {
        int selectedRow = table.getSelectedRow(); 
        
        if (selectedRow != -1) { 
            tableModel.removeRow(selectedRow); 
        }
    }

    public void populateItems(List<Item> items) {
        tableModel.setRowCount(0); 
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
    
    public JTable getTable() {
        return table;
    }
   
}

