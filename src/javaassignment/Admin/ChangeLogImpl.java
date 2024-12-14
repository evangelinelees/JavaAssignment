package javaassignment.Admin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChangeLogImpl implements ChangeLogDAO {

    private static final String UNIFIED_FILE = "UnifiedData.txt"; // The unified output file
    private static List<ChangeLog> logs = new ArrayList<>();

    // Constructor to initialize and create a file if it doesn't exist
    public ChangeLogImpl() {
        File file = new File(UNIFIED_FILE);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Log file created: " + UNIFIED_FILE);
                }
            } catch (IOException e) {
                System.err.println("Error creating log file: " + e.getMessage());
                System.out.println("Log file location: " + new File(UNIFIED_FILE).getAbsolutePath());

            }
        }
    }

    // Method to log a change to the unified file and the in-memory list
    @Override
    public void logChange(String userId, String userRole, String changeInfo, String status) {
         int newLogNo = logs.size() + 1; // Auto-increment log number
        ChangeLog newLog = new ChangeLog(newLogNo, userId, userRole, changeInfo, status); // Include userId

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(UNIFIED_FILE, true))) {
            writer.write(newLog.toString());
            writer.newLine();
            logs.add(newLog); // Add to in-memory list
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    // Method to get all logs, loading from the file if necessary
    @Override
    public List<ChangeLog> getAllLogs() {
        if (logs.isEmpty()) {
            loadLogsFromFile();
        }
        return logs;
    }

    // Method to load logs from the unified file into memory
    @Override
    public List<ChangeLog> loadLogsFromFile() {
        logs.clear(); // Clear existing logs before loading new ones
        try (BufferedReader reader = new BufferedReader(new FileReader(UNIFIED_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(" \\| ");  // Fixed space and pipe split
                    if (parts.length == 5) {  // Adjusted to match log fields (logNo, userId, userRole, changeInfo, status)
                        int logNo = Integer.parseInt(parts[0].trim());
                        String userId = parts[1].trim();  // Added userId
                        String userRole = parts[2].trim();
                        String changeInfo = parts[3].trim();
                        String status = parts[4].trim();
                        logs.add(new ChangeLog(logNo, userId, userRole, changeInfo, status)); // Create with userId
                    }
                } catch (Exception e) {
                    System.err.println("Skipping malformed log entry: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading log file: " + e.getMessage());
        }
        return logs;
    }

    // Method to get a log by its ID
    @Override
    public ChangeLog getLogById(int logId) {
        for (ChangeLog log : logs) {
            if (log.getLogNo() == logId) {
                return log;
            }
        }
        return null;
    }

    // New method to filter logs by user role
    public List<ChangeLog> getLogsByRole(String userRole) {
        return logs.stream()
                   .filter(log -> log.getUserRole().equalsIgnoreCase(userRole))
                   .collect(Collectors.toList());
    }

    // Method to filter logs by user ID
    @Override
    public List<ChangeLog> getLogsByUser(String userId) {
        List<ChangeLog> userLogs = new ArrayList<>();
        for (ChangeLog log : logs) {
            if (log.getUserId().equalsIgnoreCase(userId)) {
                userLogs.add(log);
            }
        }
        return userLogs;
    }

    // Method to filter logs by status
    @Override
    public List<ChangeLog> getLogsByStatus(String status) {
        List<ChangeLog> statusLogs = new ArrayList<>();
        for (ChangeLog log : logs) {
            if (log.getStatus().equalsIgnoreCase(status)) {
                statusLogs.add(log);
            }
        }
        return statusLogs;
    }

}
