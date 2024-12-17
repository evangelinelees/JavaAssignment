
package javaassignment.Admin;

import javaassignment.Admin.AdminMainPage;
import java.util.List;
import javaassignment.Admin.AdminDAOImpl;
import javax.swing.JOptionPane;
import javaassignment.Admin.AdminDAO;

/**
 *
 * @author jchok
 */
public class UsersList extends javax.swing.JFrame {
    private String loggedInUser;

    /**
     * Creates new form UsersList
     */
    public UsersList(String loggedInUser) {
        initComponents();
        loadUsers();
        this.loggedInUser = loggedInUser;
        //sessionUser.setText(loggedInUser);
    }
    public UsersList() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Back_BTN = new javax.swing.JButton();
        AddUser_BTN = new javax.swing.JButton();
        EditUserBTN = new javax.swing.JButton();
        Delete_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Users");

        Back_BTN.setBackground(new java.awt.Color(255, 255, 204));
        Back_BTN.setText("Back");
        Back_BTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BTNActionPerformed(evt);
            }
        });

        AddUser_BTN.setBackground(new java.awt.Color(255, 255, 204));
        AddUser_BTN.setText("Add User");
        AddUser_BTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AddUser_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUser_BTNActionPerformed(evt);
            }
        });

        EditUserBTN.setBackground(new java.awt.Color(255, 255, 204));
        EditUserBTN.setText("Edit User");
        EditUserBTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        EditUserBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUserBTNActionPerformed(evt);
            }
        });

        Delete_BTN.setBackground(new java.awt.Color(255, 255, 204));
        Delete_BTN.setText("Delete User");
        Delete_BTN.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Delete_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(AddUser_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(EditUserBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Back_BTN))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete_BTN)
                    .addComponent(EditUserBTN)
                    .addComponent(AddUser_BTN))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

                                           
    private void Back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BTNActionPerformed
        AdminMainPage adminmain = new AdminMainPage();
        adminmain.setVisible(true); // Show the edit user page
        this.dispose(); // Close the current page if required

    }//GEN-LAST:event_Back_BTNActionPerformed

    private void EditUserBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUserBTNActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Get the user ID from the selected row
        String userId = jTable1.getValueAt(selectedRow, 0).toString();
        
        // Fetch the user from the database using the UserDAO
        AdminDAO userDAO = new AdminDAOImpl();
        User user = userDAO.getUserById(userId);  // Use userId instead of id

        if (user != null) {
            // Open the Update User form and pass the User object
            EditUser EditUser = new EditUser(user);  // UpdateUser should have a constructor accepting a User object
            EditUser.setVisible(true);
        } else {
            // Handle case where user was not found
            JOptionPane.showMessageDialog(this, "User not found.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a user to edit.");
    }
    
    }//GEN-LAST:event_EditUserBTNActionPerformed

    private void Delete_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_BTNActionPerformed
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        String userId = jTable1.getValueAt(selectedRow, 0).toString();
        AdminDAO userDAO = new AdminDAOImpl();
        boolean isDeleted = userDAO.deleteUser(userId);
        if (isDeleted) {
            JOptionPane.showMessageDialog(this, "User deleted successfully.");
            loadUsers(); // Reload the users list after deletion
        } else {
            JOptionPane.showMessageDialog(this, "Error deleting user.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a user to delete.");
    }

               
    }//GEN-LAST:event_Delete_BTNActionPerformed

    private void AddUser_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUser_BTNActionPerformed
        
       AdminRegistrationPage AMP = new AdminRegistrationPage(loggedInUser);
       AMP.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_AddUser_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UsersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersList().setVisible(true);
            }
        });
    }
    
    private void loadUsers() {
    // Get the list of users from the UserDAO (this can be from a file or database)
    AdminDAO userDAO = new AdminDAOImpl();
    List<User> users = userDAO.getAllUsers(); // Fetch the list of users
    
    // Create a 2D array to hold the user data for the table
    Object[][] userData = new Object[users.size()][6];
    
    for (int i = 0; i < users.size(); i++) {
        User user = users.get(i);
        userData[i][0] = user.getUserId();     
        userData[i][1] = user.getFullName();
        userData[i][2] = user.getEmail();
        userData[i][3] = user.getIcNumber();
        userData[i][4] = user.getPhNumber();       
        userData[i][5] = user.getUserRole();      
                
    }
    
    // Define the column names for the table
    String[] columnNames = {"User ID", "Full Name", "Email", "Ic Number","Phone Number", "Role"};
    
    // Set the table model with column names and data
    jTable1.setModel(new javax.swing.table.DefaultTableModel(userData, columnNames));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUser_BTN;
    private javax.swing.JButton Back_BTN;
    private javax.swing.JButton Delete_BTN;
    private javax.swing.JButton EditUserBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
