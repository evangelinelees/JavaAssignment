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
import javax.swing.table.DefaultTableModel;

public class ItemInputForm extends JPanel {
    private InventoryController inventoryController;
    private DataHandling inputValidator = new DataHandling();
    private DefaultTableModel tableModel;

    public ItemInputForm(InventoryController inventoryController) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
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

        // Validate the input
        int quantity = 0;
        double price = 0;

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

        // Call the controller to save the item
        inventoryController.saveItem(itemId, itemName, description, quantity, price);

        // Optionally update the item input panel or table with the new item
        itemInputPanel.addItem(itemId, itemName, description, String.valueOf(quantity), String.valueOf(price));

        // Clear the fields after saving
        clearFields();
    }

    private void clearFields() {
        itemIdField.setText("");
        itemNameField.setText("");
        descriptionField.setText("");
        quantityField.setText("");
        priceField.setText("");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton1 = new Components.ItemInput.SaveButton();
        itemInputPanel = new Components.ItemInput.ItemInputPanel();
        itemIdField = new javax.swing.JTextField();
        itemNameField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        quantityField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(itemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(itemNameField)
                    .addComponent(descriptionField)
                    .addComponent(quantityField)
                    .addComponent(priceField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(itemNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(saveButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIdFieldActionPerformed
        // todo add item selction for editng
        
    }//GEN-LAST:event_itemIdFieldActionPerformed
    private void addListeners() {
        saveButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveItem();
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
    private Components.ItemInput.SaveButton saveButton1;
    // End of variables declaration//GEN-END:variables
}
