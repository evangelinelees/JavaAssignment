
package javaassignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ChangeLogImpl extends ChangeLog implements ChangeLogDAO {

    public ChangeLogImpl(int newLogNo, String userId, String changeInfo, String status) {
    }
private static final String LOG_FILE_PATH = "path/to/logfile.txt"; // Adjust the file path
private static List<ChangeLogDAO> logs = new ArrayList<>();   
@Override
    public void logChange(String userId, String changeInfo, String status) {
        int newLogNo = logs.size() + 1; // Get next available log number
        ChangeLogImpl newLog = new ChangeLogImpl(newLogNo, userId, changeInfo, status);
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE_PATH, true))) {
            writer.write(newLog.getLogNo() + "." + " " + newLog.getUserId() + " | " + newLog.getChangeInfo() + " | " + newLog.getStatus());
            writer.newLine();
            logs.add(newLog); // Add to in-memory logs list
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }

    @Override
    public List<ChangeLogDAO> getAllLogs() {
        return logs;
    }

    @Override
    public ChangeLogDAO getLogById(int logId) {
        for (ChangeLogDAO log : logs) {
            if (log.getLogNo() == logId) {
                return log;
            }
        }
        return null;
    }    
}
    

