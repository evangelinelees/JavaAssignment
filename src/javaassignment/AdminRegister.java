
package javaassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
import javax.swing.JOptionPane;


public class AdminRegister extends javax.swing.JPanel {
        
    
    public AdminRegister() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FN_TF = new javax.swing.JTextField();
        IC_TF = new javax.swing.JTextField();
        Pass_TF = new javax.swing.JTextField();
        Register_Button = new javax.swing.JButton();
        Back_Button = new javax.swing.JButton();
        Role_CB = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Email_TF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PNumber_TF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registration");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Full Name ");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("IC Number ");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Role ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Password");

        FN_TF.setBackground(new java.awt.Color(204, 204, 204));
        FN_TF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        FN_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FN_TFActionPerformed(evt);
            }
        });

        IC_TF.setBackground(new java.awt.Color(204, 204, 204));
        IC_TF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Pass_TF.setBackground(new java.awt.Color(204, 204, 204));
        Pass_TF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        Register_Button.setBackground(new java.awt.Color(204, 255, 255));
        Register_Button.setForeground(new java.awt.Color(0, 0, 0));
        Register_Button.setText("Register");
        Register_Button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Register_ButtonActionPerformed(evt);
            }
        });

        Back_Button.setBackground(new java.awt.Color(204, 255, 255));
        Back_Button.setForeground(new java.awt.Color(0, 0, 0));
        Back_Button.setText("Back");
        Back_Button.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        Role_CB.setBackground(new java.awt.Color(204, 204, 204));
        Role_CB.setForeground(new java.awt.Color(0, 0, 0));
        Role_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sales Manager", "Purchase Manager", "Inventory Manager", "Finance Manager" }));
        Role_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Role_CBActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Email");

        Email_TF.setBackground(new java.awt.Color(204, 204, 204));
        Email_TF.setForeground(new java.awt.Color(0, 0, 0));
        Email_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_TFActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Phone Number");

        PNumber_TF.setBackground(new java.awt.Color(204, 204, 204));
        PNumber_TF.setForeground(new java.awt.Color(0, 0, 0));
        PNumber_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNumber_TFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FN_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(IC_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Pass_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addComponent(Role_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Email_TF)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Register_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PNumber_TF)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FN_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IC_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(Pass_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Role_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Email_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PNumber_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Register_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(Back_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FN_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FN_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FN_TFActionPerformed

    private void Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Register_ButtonActionPerformed
        String PhNumber = PNumber_TF.getText().trim();
        String email = Email_TF.getText().trim();
        String password = Pass_TF.getText(); 
        String IcNumber = IC_TF.getText();
        String fullName = FN_TF.getText();
        String role = (String) Role_CB.getSelectedItem();   
        
        
//        String filePath = filePaths.USER.getPath();
//        
//        // Check if user exists
//        if (doesUserExist(filePath, fullName, email, IcNumber)) {
//            JOptionPane.showMessageDialog(null, "User already exists!");
//        } else {
//            // Register new user and write to file
//            String newUserRecord = fullName + "," + email + "," + IcNumber + "," + PhNumber + "," + password + "," + role;
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
//                writer.write(newUserRecord);
//                writer.newLine();
//                JOptionPane.showMessageDialog(null, "User registered successfully!");
//            } catch (IOException ex) {
//                JOptionPane.showMessageDialog(null, "Error writing to file: " + ex.getMessage());
//            }
//        }
        
        
   
   
    
    
    
    // Clear fields after registration
    FN_TF.setText("");
    IC_TF.setText("");
    Pass_TF.setText("");
    Email_TF.setText("");
    PNumber_TF.setText("");
    Role_CB.setSelectedIndex(0);

    }//GEN-LAST:event_Register_ButtonActionPerformed

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void Role_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Role_CBActionPerformed

    }//GEN-LAST:event_Role_CBActionPerformed

    private void Email_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_TFActionPerformed

    private void PNumber_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNumber_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNumber_TFActionPerformed

      

// Method to generate a unique user ID with role-based prefix
private String generateUserId(String role) {
    String prefix;
    switch (role) {
        case "Sales Manager":
            prefix = "SM";
            break;
        case "Purchase Manager":
            prefix = "PM";
            break;
        case "Inventory Manager":
            prefix = "IM";
            break;
        case "Finance Manager":
            prefix = "FM";
            break;
        default:
            throw new IllegalArgumentException("Invalid role: " + role);
    }
    return prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JTextField Email_TF;
    private javax.swing.JTextField FN_TF;
    private javax.swing.JTextField IC_TF;
    private javax.swing.JTextField PNumber_TF;
    private javax.swing.JTextField Pass_TF;
    private javax.swing.JButton Register_Button;
    private javax.swing.JComboBox<String> Role_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
