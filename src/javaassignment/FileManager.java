///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javaassignment;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FileManager {
//    private final String filePath;
//
//    public FileManager(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public List<Items> readItems() throws IOException {
//        List<Items> items = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        String line;
//
//        while ((line = reader.readLine()) != null) {
//            String[] data = line.split("\\|");
//            if (data.length == 3) {
//                String date = data[0].trim();
//                String name = data[1].trim();
//                int quantity = Integer.parseInt(data[2].trim());
//                items.add(new Items(date, name, quantity));
//            }
//        }
//        reader.close();
//        return items;
//    }
//
//    public void saveItems(List<Items> items) throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
//        for (Items item : items) {
//            writer.write(item.toString());
//            writer.newLine();
//        }
//        writer.close();
//    }
//}
