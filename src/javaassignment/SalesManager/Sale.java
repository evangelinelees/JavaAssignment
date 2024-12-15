/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.SalesManager;

/**
 *
 * @author vroom
 */
public class Sale {

    private String date;        // e.g., "2024-12-13"
    private String itemCode;    // e.g., "ITEM001"
    private String itemName;    // e.g., "Laptop"
    private double unitPrice;   // e.g., 1200.0
    private int quantitySold;   // e.g., 4
    private double losses;      // e.g., 2
    private double profit;      // e.g., 2400.0

    // Constructor
    public Sale(String date, String itemCode, String itemName, double unitPrice, int quantitySold, double losses, double profit) {
        this.date = date;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
        this.losses = losses;
        this.profit = profit;
    }

    // Getters
    public String getDate() { return date; }
    public String getMonthYear() { return date.substring(0, 7); } // e.g., "2024-12"
    public String getYear() { return date.substring(0, 4); }      // e.g., "2024"
    public double getLosses() { return losses; }
    public double getProfit() { return profit; }
    public double getTotalSales() { return unitPrice * quantitySold; }


    
}
