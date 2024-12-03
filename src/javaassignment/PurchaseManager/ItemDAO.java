/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaassignment.PurchaseManager;
import java.util.List;

/**
 *
 * @author User
 */
public interface ItemDAO {
    List<ItemModel> loadAll(); 
    List<ItemModel> getAllItems();
}
