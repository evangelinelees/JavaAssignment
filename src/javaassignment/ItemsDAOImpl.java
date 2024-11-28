/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vroom
 */
public class ItemsDAOImpl implements ItemsDAO {
    private final String filePath = "ITEMS.TXT";
    
    @Override
    public List<Items> viewItems() {
        List<Items> items = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\|");
                if (data.length == 2) {
                    String name = data[0].trim();
                    int quantity = Integer.parseInt(data[1].trim());
                    items.add(new Items(name, quantity));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }
    
    
}
