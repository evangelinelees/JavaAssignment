/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplementation;

/**
 *
 * @author User
 */

import Models.InventoryRecord;
import java.util.List;

public interface InventoryRecordDao {
    void addInventoryRecord(InventoryRecord record);
    List<InventoryRecord> getAllInventoryRecords();
    // Other methods...
}

