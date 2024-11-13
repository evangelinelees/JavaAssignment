
package javaassignment;


public  class User {
    private String userId, fullName, email, PhNumber, password,IcNumber;
    
    
    
    public User(){

    }
    
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    public User(String userId, String email, String PhNumber,int identificationNumber, String password){
        this.userId = userId;
        this.email = email;
        this.IcNumber = IcNumber;
        this.PhNumber = PhNumber;
        this.password = password;
        this.fullName = fullName;
    }

 
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNumber() {
        return PhNumber;
    }

    public void setPhNumber(String PhNumber) {
        this.PhNumber = PhNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIcNumber() {
        return IcNumber;
    }

    public void setIcNumber(String IcNumber) {
        this.IcNumber = IcNumber;
    }
    

    


  
   

}
