/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.SalesManager;

/**
 *
 * @author vroom
 */
import java.util.*;
import java.util.stream.Collectors;

public class SalesAggregator {

    public static Map<String, Double> getMonthlySales(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getMonthYear,
                Collectors.summingDouble(Sale::getTotalSales)
            ));
    }

    public static Map<String, Double> getMonthlyLosses(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getMonthYear,
                Collectors.summingDouble(Sale::getLosses)
            ));
    }

    public static Map<String, Double> getMonthlyProfits(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getMonthYear,
                Collectors.summingDouble(Sale::getProfit)
            ));
    }
    
    public static Map<String, Double> getAnnualSales(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getYear,
                Collectors.summingDouble(Sale::getTotalSales)
            ));
    }

    public static Map<String, Double> getAnnualLosses(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getYear,
                Collectors.summingDouble(Sale::getLosses)
            ));
    }

    public static Map<String, Double> getAnnualProfits(List<Sale> sales) {
        return sales.stream()
            .collect(Collectors.groupingBy(
                Sale::getYear,
                Collectors.summingDouble(Sale::getProfit)
            ));
    }
}

