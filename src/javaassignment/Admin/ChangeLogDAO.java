package javaassignment.Admin;

import java.util.List;

public interface ChangeLogDAO {

    void logChange(String userId,String userRole, String changeInfo, String status); // Add a new log entry
    List<ChangeLog> getAllLogs(); // Retrieve all logs
    List<ChangeLog> loadLogsFromFile(); // Load logs from file into memory
    ChangeLog getLogById(int logId); // Get a log by its ID
    List<ChangeLog> getLogsByUser(String userId); // Retrieve logs by a specific user
    List<ChangeLog> getLogsByStatus(String status); // Retrieve logs by their status
}
