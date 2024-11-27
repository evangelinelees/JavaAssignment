
package javaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ChangeLogImpl implements ChangeLogDAO {
    
    private static final String logFile = "Log.txt"; // Log file path
    private static List<ChangeLog> logs = new ArrayList<>(); // In-memory log list


    

    @Override
    public void logChange(String userId, String changeInfo, String status) {
        int newLogNo = logs.size() + 1; // Auto-increment log number
        ChangeLog newLog = new ChangeLog(newLogNo, userId, changeInfo, status);

        // Write log to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(newLog.toString());
            writer.newLine();
            logs.add(newLog);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    @Override
    public List<ChangeLog> getAllLogs() {
        if (logs.isEmpty()) {
                    loadLogsFromFile(); // Load logs from file if not already loaded
                }
                return logs;
    }

    @Override
    public List<ChangeLog> loadLogsFromFile() {
        logs.clear(); // Clear current logs
                try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        try {
                            String[] parts = line.split("\\.| \\| ");
                            int logNo = Integer.parseInt(parts[0].trim());
                            String userId = parts[1].trim();
                            String changeInfo = parts[2].trim();
                            String status = parts[3].trim();
                            logs.add(new ChangeLog(logNo, userId, changeInfo, status));
                        } catch (Exception e) {
                            System.err.println("Skipping malformed line: " + line);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error reading log file: " + e.getMessage());
                }
                return logs;
    }

    @Override
    public ChangeLog getLogById(int logId) {
        for (ChangeLog log : logs) {
                    if (log.getLogNo() == logId) {
                        return log;
                    }
                }
                return null; // Log not found
            }
}

 

    
    
    

   

    

