
package javaassignment;


public class Admin extends User{
    private String userId, password;
    
    public Admin(){
    this.userId = "Admin";
    this.password = "admin123";
}

    @Override
    public String getUserId() {
        return userId;
    }

   
    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}


