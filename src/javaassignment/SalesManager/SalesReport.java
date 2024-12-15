/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.SalesManager;

/**
 *
 * @author vroom
 */

import java.io.*;
import java.util.*;

public class SalesReport {

    public static List<Sale> readSalesFile(String filePath) throws IOException {
        List<Sale> sales = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split("\\|"); // Split fields by '|'
                if (fields.length == 7) {
                    String date = fields[0];
                    String itemCode = fields[1];
                    String itemName = fields[2];
                    double unitPrice = Double.parseDouble(fields[3]);
                    int quantitySold = Integer.parseInt(fields[4]);
                    double losses = Double.parseDouble(fields[5]);
                    double profit = Double.parseDouble(fields[6]);
                    sales.add(new Sale(date, itemCode, itemName, unitPrice, quantitySold, losses, profit));
                }
            }
        }
        return sales;
    }
}

