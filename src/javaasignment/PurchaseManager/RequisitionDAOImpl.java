/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaasignment.PurchaseManager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class RequisitionDAOImpl /*implements RequisitionDAO*/ {
    private final String requisitionFilePath = "REQUISITION.txt";
    

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
    
    // Check for duplicates in the file
    public boolean isDuplicate(String itemCode, String itemName, String currentQuantity, String proposedQuantity, String userId) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(requisitionFilePath));
            String line;

            // Loop through each line in the file
            while ((line = reader.readLine()) != null) {
                String[] requisitionDetails = line.split("\\|");
                if (requisitionDetails.length == 5) {
                    Requisition requisition = new Requisition(requisitionDetails);
                    if (requisition.getItemCode().equals(itemCode) &&
                        requisition.getItemName().equals(itemName) &&
                        requisition.getCurrentQuantity().equals(currentQuantity) &&
                        requisition.getProposedQuantity().equals(proposedQuantity) &&
                        requisition.getUserId().equals(userId)) {
                        reader.close();
                        return true; // Duplicate found
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No duplicate found
    }
    
    // Load all requisitions from the file
    public List<Requisition> getAllRequisitions() {
        List<Requisition> requisitions = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(requisitionFilePath));
            String line;

            // Loop through each line in the file
            while ((line = reader.readLine()) != null) {
                String[] requisitionDetails = line.split("\\|");
                if (requisitionDetails.length == 5) {
                    requisitions.add(new Requisition(requisitionDetails));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return requisitions;
    }

    
}

    

