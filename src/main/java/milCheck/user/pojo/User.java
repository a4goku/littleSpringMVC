package milCheck.user.pojo;

import java.io.Serializable;

public class User {
    private String userName;
    private String userNo;
    private String password;

    public User(String userName, String password, String userNo){
        this.userName = userName;
        this.password = password;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
