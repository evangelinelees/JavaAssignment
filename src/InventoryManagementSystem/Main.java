package InventoryManagementSystem;

import Forms.DefaultForm;
import Forms.HomeForm;
import Forms.ItemInputForm;
import Forms.InventoryForm;
import Forms.UserForm;
import Forms.InboxForm;
import java.awt.Component;
import Components.MainMenu.MenuEvent;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import Components.MainMenu.Header;
/**
 *
 * @author RAVEN
 */
public class Main extends javax.swing.JFrame {


    public Main() {
        initComponents();

        menu1.setEvent(new MenuEvent() {
            @Override
            public void selected(int index, int subIndex) {
                Component formToShow; // Declare the variable to hold the form

                formToShow = switch (index) {
                    case 0 -> new HomeForm(); // Dashboard
                    case 1 -> {
                        // Handle User submenu based on subIndex
                        yield switch (subIndex) {
                            case 0 -> new UserForm(); // Example for User
                            case 1 -> new InboxForm(); // Example for Inbox
                            default -> new DefaultForm("User Form: " + subIndex);
                        };
                    }
                    case 2 -> {
                        // Handle Inventory submenu based on subIndex
                        yield switch (subIndex) {
                            case 0 -> new InventoryForm(); // Inventory form
                            case 1 -> new ItemInputForm(); // Open Item Input Form
                            default -> new DefaultForm("Inventory Form: " + subIndex);
                        };
                    }
                    default -> new DefaultForm("Form: " + index + " " + subIndex);
                };

                showForm(formToShow); // Call the method to display the form
            }
        });
    }

    
    
    
    private void showForm(Component form) {
     body.removeAll();
     body.add(form);
     body.repaint();
     body.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPaneWin111 = new Components.GlobalComponents.ScrollPaneWin11();
        menu1 = new Components.MainMenu.MainMenu();
        body = new javax.swing.JPanel();
        header1 = new Components.MainMenu.Header();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        scrollPaneWin111.setBorder(null);
        scrollPaneWin111.setViewportView(menu1);

        body.setBackground(new java.awt.Color(245, 245, 245));
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        
        UIManager.put("ScrollBar", new ColorUIResource(Color.BLACK)); // Thumb color
        UIManager.put("ScrollBar.track", new ColorUIResource(Color.GRAY)); // Track color
        UIManager.put("ScrollBar.width", 12);
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private Components.MainMenu.Header header1;
    private Components.MainMenu.MainMenu menu1;
    private Components.GlobalComponents.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
