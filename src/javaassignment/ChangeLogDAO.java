
package javaassignment;

import java.util.List;

public interface ChangeLogDAO {
    
   void logChange(String userId, String changeInfo, String status);
    List<ChangeLogDAO> getAllLogs();
    ChangeLogDAO getLogById(int logId);
    int getLogNo();  // Add this method to the interface
    
}
