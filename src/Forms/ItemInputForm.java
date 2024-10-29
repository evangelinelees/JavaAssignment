

package Forms;



import javax.swing.*;
import Components.ItemInput.ItemInputPanel;
import Models.Item;
import Services.InventoryService;
import java.awt.*;
import java.util.List;


public class ItemInputForm extends JFrame {
    private InventoryService itemService;
    private ItemInputPanel inputComponents;
    private JTable itemTable;

    public ItemInputForm() {
        itemService = new InventoryService(); // Initialize the item service
        inputComponents = new ItemInputPanel();
        
        setTitle("Item Input Form");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up the layout
        setLayout(new BorderLayout());
        
        // Create the item input panel
        JPanel inputPanel = inputComponents.createInputPanel();
        add(inputPanel, BorderLayout.NORTH);
        
        // Initialize and load item table
        itemTable = new JTable(); // Add your table model here
        loadItemData();
        JScrollPane tableScrollPane = new JScrollPane(itemTable);
        add(tableScrollPane, BorderLayout.CENTER);

        // Add close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        add(closeButton, BorderLayout.SOUTH);
    }

    private void loadItemData() {
        List<Item> items = itemService.getAllItems(); // Retrieve all items
        // Load items into the JTable (you'll need to implement this logic)
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
