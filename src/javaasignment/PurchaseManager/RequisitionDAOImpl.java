/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaasignment.PurchaseManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class RequisitionDAOImpl implements RequisitionDAO {
    private final String requisitionFilePath = "REQUISITION.txt";
    

    @Override
    public boolean saveRequisition(String itemCode, String itemName, String currentQuantity, String proposedQuantity, String userId) {
        String reqDetails = itemCode + "|" + itemName + "|" + currentQuantity + "|" + proposedQuantity + "|" + userId;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(requisitionFilePath, true))) {
            writer.write(reqDetails);
            writer.newLine();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    
}

    

