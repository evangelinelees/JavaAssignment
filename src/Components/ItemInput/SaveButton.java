package Components.ItemInput;


import javax.swing.*;
import java.awt.event.ActionListener;

public class SaveButton extends JButton {

    public SaveButton() {
        // Set up the button properties
        setText("Save Input");
        setBackground(new java.awt.Color(106, 123, 157));
        setForeground(java.awt.Color.WHITE);
        setFocusPainted(false);
        setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
    }

    // Method to set the save action listener externally
    public void setSaveActionListener(ActionListener listener) {
        addActionListener(listener);
    }
}