package javaassignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javaassignment.User;
import javaassignment.UserDAO;

public class UserDAOImpl implements UserDAO {
    private final String filePath = "USERS.TXT";

    @Override
    public boolean validateLogin(String id, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\\|");
                if (userDetails.length >= 7 && userDetails[0].equals(id) && userDetails[5].equals(password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getUserRole(String id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\\|");
                if (userDetails.length >= 7 && userDetails[0].equals(id)) {
                    return userDetails[6]; // Assuming the 7th field is the role
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(String.join("|", user.toDataString()));
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        List<User> users = getAllUsers();
        boolean updated = false;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User existingUser : users) {
                if (existingUser.getUserId().equals(user.getUserId())) {
                    writer.write(String.join("|", user.toDataString()));
                    updated = true;
                } else {
                    writer.write(String.join("|", existingUser.toDataString()));
                }
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return updated;
    }

    @Override
    public boolean deleteUser(String id) {
        List<User> users = getAllUsers();
        boolean deleted = false;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : users) {
                if (!user.getUserId().equals(id)) {
                    writer.write(String.join("|", user.toDataString()));
                    writer.newLine();
                } else {
                    deleted = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deleted;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userDetails = line.split("\\|");
                if (userDetails.length >= 7) {
                    users.add(new User(userDetails));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean isIcNumberDuplicate(String icNumber) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
               String line;
               while ((line = reader.readLine()) != null) {
                   String[] userDetails = line.split("\\|");
                   if (userDetails.length > 2 && userDetails[2].equals(icNumber)) {
                       return true;
                   }
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
           return false;    
    }

    @Override
    public boolean saveUser(String fullName, String icNumber, String email, String phoneNumber, String password, String role) {
        String prefix = switch (role) {
            case "Sales Manager" -> "SM";
            case "Purchase Manager" -> "PM";
            case "Inventory Manager" -> "IM";
            case "Finance Manager" -> "FM";
            default -> "";
        };

        // Generate unique ID
        String uniqueId = prefix + new Random().nextInt(9999);
        
        int userCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                userCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String userNumber = String.valueOf(userCount + 1);

        // Format the user details
        String userDetails = userNumber + ". " + uniqueId + "|" + fullName + "|" + icNumber + "|" + email + "|" + phoneNumber + "|" + password + "|" + role;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(userDetails);
            writer.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User getUserById(String id) {
try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line by '|' to extract the user details
            String[] userDetails = line.split("\\|");
            
            // Check if the line contains the expected number of columns and matches the user ID
            if (userDetails.length >= 7 && userDetails[0].equals(id)) {
                // Return a new User object by passing the userDetails array to the User constructor
                return new User(userDetails);  // This returns a User object
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return null;  // Return null if the user is not found   
    }
}
    

   

