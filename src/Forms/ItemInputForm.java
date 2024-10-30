/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Forms;


import Components.ItemInput.ItemInputPanel;
import Controller.InventoryController;
import Models.Item;
import Utilities.DataHandling;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ItemInputForm extends JPanel {
    private final InventoryController inventoryController;
    private final DataHandling inputValidator = new DataHandling();

    public void ItemInputForm(){
        initComponents();
    }

    public ItemInputForm(InventoryController inventoryController, ItemInputPanel itemInputPanel ) {
        this.inventoryController = inventoryController;
        this.itemInputPanel = itemInputPanel;
        initComponents();
        loadItems(); 
        addListeners();
        clearFields();
        customizeSaveButton("Save");
        customizeUpdateButton("Update");
    }
    
    
    private void loadItems() {
        List<Item> items = inventoryController.getAllItems(); // Assuming this method exists
        if (itemInputPanel != null) {
            itemInputPanel.populateItems(items);
        }
    }

    private void saveItem() {
        // Get values from the fields
        String itemId = itemIdField.getText().trim();
        String itemName = itemNameField.getText().trim();
        String description = descriptionField.getText().trim();
        String quantityText = quantityField.getText().trim();
        String priceText = priceField.getText().trim();


        if (!inputValidator.validateItemId(itemId)) {
        JOptionPane.showMessageDialog(this, "Item ID must be valid", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!inputValidator.validateQuantity(quantityText)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid non-negative integer for quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!inputValidator.validatePrice(priceText)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid non-negative number for price.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        int quantity = Integer.parseInt(quantityText); // Convert after validation
        double price = Double.parseDouble(priceText);
        
        // Call the controller to save the item
        inventoryController.saveItem(itemId, itemName, description, quantity, price);

        // Optionally update the item input panel or table with the new item
        itemInputPanel.addItem(itemId, itemName, description, String.valueOf(quantity), String.valueOf(price));

        // Clear the fields after saving
        clearFields();
    }
    
    private void updateItem() {
        String itemId = itemIdField.getText().trim();
        String itemName = itemNameField.getText().trim();
        String description = descriptionField.getText().trim();
        String quantityText = quantityField.getText().trim();
        String priceText = priceField.getText().trim();

        int selectedRow = itemInputPanel.getTable().getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "No item selected for update.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate item ID
        if (!inputValidator.validateItemId(itemId)) {
            JOptionPane.showMessageDialog(this, "Item ID must be valid", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate and convert quantity
        int quantity = 0;  // Default value
        if (!inputValidator.validateQuantity(quantityText)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid non-negative integer for quantity.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            quantity = Integer.parseInt(quantityText);  // Convert string to int
        }

        // Validate and convert price
        double price = 0.0;  // Default value
        if (!inputValidator.validatePrice(priceText)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid non-negative number for price.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            price = Double.parseDouble(priceText);  // Convert string to double
        }

        // Call the controller to update the item
        inventoryController.updateItem(itemId, itemName, description, quantity, price);

        // Reload the items and refresh the UI
        loadItems();
        clearFields();
        refreshItemTable();
    }
    

    private void clearFields() {
        itemIdField.setText("");
        itemNameField.setText("");
        descriptionField.setText("");
        quantityField.setText("");
        priceField.setText("");
    }
    
    private void refreshItemTable() {
    // Reload and populate the table with updated items
    List<Item> items = inventoryController.getAllItems();
    itemInputPanel.populateItems(items);
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemIdField = new javax.swing.JTextField();
        itemNameField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        scrollPaneWin111 = new Components.GlobalComponents.ScrollPaneWin11();
        itemInputPanel = new Components.ItemInput.ItemInputPanel();
        universalButton1 = new Components.ItemInput.UniversalButton();
        universalButton2 = new Components.ItemInput.UniversalButton();

        itemIdField.setText("jTextField1");
        itemIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIdFieldActionPerformed(evt);
            }
        });

        itemNameField.setText("jTextField2");

        descriptionField.setText("jTextField3");

        quantityField.setText("jTextField4");

        priceField.setText("jTextField5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(itemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(itemNameField)
                            .addComponent(descriptionField)
                            .addComponent(quantityField)
                            .addComponent(priceField)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(universalButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(universalButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(universalButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(universalButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIdFieldActionPerformed
        // todo add item selction for editng
        
    }//GEN-LAST:event_itemIdFieldActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButton1ActionPerformed
   
    private void customizeSaveButton(String text) {
        universalButton1.setText(text);
    }      
    
    private void customizeUpdateButton(String text) {
        universalButton2.setText(text);
    }  
    private void addListeners() {
        universalButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveItem();
            }
        });
        
        universalButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateItem();
            }
        });
        
       
        itemInputPanel.getTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) { // Only react when selection is final
                    int selectedRow = itemInputPanel.getTable().getSelectedRow();
                    if (selectedRow >= 0) {
                        // Get values from the selected row and populate the fields
                        String itemId = itemInputPanel.getTable().getValueAt(selectedRow, 0).toString(); // Assuming ID is in the first column
                        String itemName = itemInputPanel.getTable().getValueAt(selectedRow, 1).toString();
                        String description = itemInputPanel.getTable().getValueAt(selectedRow, 2).toString();
                        String quantity = itemInputPanel.getTable().getValueAt(selectedRow, 3).toString();
                        String price = itemInputPanel.getTable().getValueAt(selectedRow, 4).toString();

                        // Populate the fields for editing
                        itemIdField.setText(itemId);
                        itemNameField.setText(itemName);
                        descriptionField.setText(description);
                        quantityField.setText(quantity);
                        priceField.setText(price);
                    }
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField descriptionField;
    private javax.swing.JTextField itemIdField;
    private Components.ItemInput.ItemInputPanel itemInputPanel;
    private javax.swing.JTextField itemNameField;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField quantityField;
    private Components.GlobalComponents.ScrollPaneWin11 scrollPaneWin111;
    private Components.ItemInput.UniversalButton universalButton1;
    private Components.ItemInput.UniversalButton universalButton2;
    // End of variables declaration//GEN-END:variables
}
