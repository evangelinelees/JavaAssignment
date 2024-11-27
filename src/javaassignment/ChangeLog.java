
package javaassignment;




public  class ChangeLog  {
    private int logNo;
    private String userId;
    private String changeInfo;
    private String status;
    
    public ChangeLog(int logNo, String userId, String changeInfo, String status) {
        this.logNo = logNo;
        this.userId = userId;
        this.changeInfo = changeInfo;
        this.status = status;
    }

    public int getLogNo() {
        return logNo;
    }

    public void setLogNo(int logNo) {
        this.logNo = logNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChangeInfo() {
        return changeInfo;
    }

    public void setChangeInfo(String changeInfo) {
        this.changeInfo = changeInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return logNo + ". " + userId + " | " + changeInfo + " | " + status;
    }


}
