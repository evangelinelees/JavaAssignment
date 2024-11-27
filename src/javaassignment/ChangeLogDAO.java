
package javaassignment;

import java.util.List;

public interface ChangeLogDAO  {
    
    void logChange(String userId, String changeInfo, String status);
    List<ChangeLog> getAllLogs();
    List<ChangeLog> loadLogsFromFile();
    ChangeLog getLogById(int logId);
    
    
    
    
}
