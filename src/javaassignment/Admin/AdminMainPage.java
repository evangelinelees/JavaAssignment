package javaassignment.Admin;

import javaassignment.Admin.SM.AdminSMPage;
import java.util.List;
import java.util.stream.Collectors;
import javaassignment.LoginPage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AdminMainPage extends javax.swing.JFrame {
    private User user;
    private String loggedInUser;
    
    
    
    /**
     * Creates new form AdminMainPage
     */
    public AdminMainPage(String loggedInUser) {
        initComponents();
        this.loggedInUser = loggedInUser;
        sessionUser.setText(loggedInUser);
        
    }
    
    public AdminMainPage(){
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        setLocationRelativeTo(null);
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RegisterBTN = new javax.swing.JButton();
        EditBTN = new javax.swing.JButton();
        InventoryBTN = new javax.swing.JButton();
        FinanceBTN = new javax.swing.JButton();
        SalesBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        notificationTable = new javax.swing.JTable();
        Refresh_BTN = new javax.swing.JToggleButton();
        LogoutBTN = new javax.swing.JButton();
        sessionUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        RegisterBTN.setText("Registration");
        RegisterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBTNActionPerformed(evt);
            }
        });

        EditBTN.setText("Edit user ");
        EditBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBTNActionPerformed(evt);
            }
        });

        InventoryBTN.setText("Inventory");
        InventoryBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryBTNActionPerformed(evt);
            }
        });

        FinanceBTN.setText("Finance");
        FinanceBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinanceBTNActionPerformed(evt);
            }
        });

        SalesBTN.setText("Sales");
        SalesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesBTNActionPerformed(evt);
            }
        });

        notificationTable.setBackground(new java.awt.Color(153, 204, 255));
        notificationTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        notificationTable.setForeground(new java.awt.Color(255, 255, 255));
        notificationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "ID", "Information", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        notificationTable.setToolTipText("");
        notificationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(notificationTable);
        if (notificationTable.getColumnModel().getColumnCount() > 0) {
            notificationTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            notificationTable.getColumnModel().getColumn(1).setPreferredWidth(5);
        }

        Refresh_BTN.setText("Refresh");
        Refresh_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InventoryBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FinanceBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SalesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Refresh_BTN)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RegisterBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditBTN)
                        .addGap(46, 46, 46)
                        .addComponent(InventoryBTN)
                        .addGap(48, 48, 48)
                        .addComponent(FinanceBTN)
                        .addGap(43, 43, 43)
                        .addComponent(SalesBTN))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Refresh_BTN)
                .addGap(11, 11, 11))
        );

        LogoutBTN.setText("Logout");
        LogoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBTNActionPerformed(evt);
            }
        });

        sessionUser.setBackground(new java.awt.Color(153, 204, 255));
        sessionUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sessionUser.setForeground(new java.awt.Color(0, 0, 0));
        sessionUser.setBorder(null);
        sessionUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LogoutBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(sessionUser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LogoutBTN)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sessionUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBTNActionPerformed
       AdminRegistrationPage RP = new AdminRegistrationPage();
       
       RP.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_RegisterBTNActionPerformed

    private void SalesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesBTNActionPerformed
        AdminSMPage ASMP = new AdminSMPage();
        ASMP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalesBTNActionPerformed

    private void notificationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationTableMouseClicked
            
    }//GEN-LAST:event_notificationTableMouseClicked

    private void InventoryBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InventoryBTNActionPerformed

    private void FinanceBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinanceBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FinanceBTNActionPerformed

    private void LogoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBTNActionPerformed
        LoginPage LP = new LoginPage();
        LP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBTNActionPerformed

    private void EditBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBTNActionPerformed
        UsersList usersListPage = new UsersList();
        usersListPage.setVisible(true); // Show the edit user page
        this.dispose(); // Close the current page if required
    }//GEN-LAST:event_EditBTNActionPerformed

    private void Refresh_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_BTNActionPerformed
   
    }//GEN-LAST:event_Refresh_BTNActionPerformed

    private void sessionUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sessionUserActionPerformed


    
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPage().setVisible(true);
                
            }
        });
    }
     
     
     
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBTN;
    private javax.swing.JButton FinanceBTN;
    private javax.swing.JButton InventoryBTN;
    private javax.swing.JButton LogoutBTN;
    private javax.swing.JToggleButton Refresh_BTN;
    private javax.swing.JButton RegisterBTN;
    private javax.swing.JButton SalesBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationTable;
    private javax.swing.JTextField sessionUser;
    // End of variables declaration//GEN-END:variables
}

