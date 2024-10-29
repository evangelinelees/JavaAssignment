/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Components.ItemInput;

import javax.swing.*;
import java.awt.*;

public class ItemInputPanel {
    private JTextField itemIdField;
    private JTextField itemNameField;
    private JTextField descriptionField;
    private JTextField quantityField;
    private JTextField priceField;

    public ItemInputPanel() {
        itemIdField = new JTextField(20);
        itemNameField = new JTextField(20);
        descriptionField = new JTextField(20);
        quantityField = new JTextField(20);
        priceField = new JTextField(20);
    }

    public JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Item ID:"));
        panel.add(itemIdField);
        panel.add(new JLabel("Item Name:"));
        panel.add(itemNameField);
        panel.add(new JLabel("Description:"));
        panel.add(descriptionField);
        panel.add(new JLabel("Quantity:"));
        panel.add(quantityField);
        panel.add(new JLabel("Price:"));
        panel.add(priceField);
        return panel;
    }

    public JTextField getItemIdField() {
        return itemIdField;
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getDescriptionField() {
        return descriptionField;
    }

    public JTextField getQuantityField() {
        return quantityField;
    }

    public JTextField getPriceField() {
        return priceField;
    }
}

