//package javaassignment;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TxtEditor {
//
//  
//
//    public enum FilePaths {
//        USER("C:\\Users\\jchok\\Desktop\\Java Assignment\\JavaAssignment\\USERS.txt"),
//        ITEM_LIST("C:\\Users\\jchok\\Desktop\\Java Assignment\\JavaAssignment\\ITEM_LIST.txt"),
//        PURCHASE_ORDER("C:\\Users\\jchok\\Desktop\\Java Assignment\\JavaAssignment\\PURCHASE_ORDER.txt"),
//        SUPPLIER("C:\\Users\\jchok\\Desktop\\Java Assignment\\JavaAssignment\\SUPPLIER.txt");
//
//        private final String filePaths;
//
//        FilePaths(String path) {
//            this.filePaths = path;
//        }
//
//        public String getPath() {
//            return filePaths;
//        }
//    }
//
//    // Method to write DataProvider objects to file
//    public static void fileWriter(FilePaths path, DataProvider data){
//        try{
//            File nFile = new File(path.getPath());
//            
//            if(nFile.createNewFile()){
//                System.out.println("File creted: " + nFile.getName());
//                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.filePaths));
//                oos.writeObject(data);
//                System.out.println("Successfully wrote to the file");
//                oos.close();
//            }else{
//                try{
//                    List<DataProvider> container = fileReader(path);
//                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.filePaths));
//                    for(DataProvider object : container){
//                        oos.writeObject(object);
//                    }
//                    oos.writeObject(data);
//                    System.out.println("Successfully wrote to the file");
//                    oos.close();
//    
//                }catch(IOException e){
//                    System.out.println("An error has occurred.");
//                }
//            }
//
//        }catch(IOException e){
//                    System.out.println("An error has occurred.");
//        }
//        
//        
//    }
//    
//    public static List<DataProvider> fileReader(FilePaths path){
//        List<DataProvider> container = new ArrayList<>();
//        
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.getPath()))) {
//
//            while (true) {
//                try {
//                    container.add((DataProvider) ois.readObject());
//                } catch (EOFException e) { //Catch EOFException to handle the end of file
//                    ois.close();
//                    break;
//                }
//            }
//
//        } catch (IOException e) {
//            System.out.println("Database file not found or empty records!");
//        } catch (ClassNotFoundException e) {
//            System.out.println("Mismatch serializable ID in the database file!");
//        }
//
//        return container;
//    }
//
//    
//    // Method to delete a DataProvider entry based on user ID
//    public static void textDelete(FilePaths filePath, DataProvider data) {
//        List<DataProvider> container = fileReader(filePath);
//
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath.getPath()))) {
//            for (DataProvider object : container) {
//                if (!object.getUserId().equals(data.getUserId())) {
//                    oos.writeObject(object);
//                }
//            }
//            System.out.println("Entry deleted successfully.");
//        } catch (IOException e) {
//            System.out.println("An error occurred during deletion: " + e.getMessage());
//        }
//    }
//
//    // Generates a unique ID based on the number of existing records
//    public static String idGenerator(FilePaths filePath) {
//        List<DataProvider> container = fileReader(filePath);
//        int counter = container.size() + 1;
//        return String.valueOf(counter);
//    }
//}
