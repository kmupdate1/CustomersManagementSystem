package Entity;

import java.util.Date;

public class Users {
    private int usersId;
    private String usersLoginName;
    private String usersLoginPassword;
    private String usersName;
    private int usersAge;
    private Date usersBirthday;
    private Date usersCreatedAt;
    private Date usersUpdatedAt;

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public void setUsersLoginName(String usersLoginName) {
        this.usersLoginName = usersLoginName;
    }

    public void setUsersLoginPassword(String usersLoginPassword) {
        this.usersLoginPassword = usersLoginPassword;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }

    public void setUsersAge(int usersAge) {
        this.usersAge = usersAge;
    }

    public void setUsersBirthday(Date usersBirthday) {
        this.usersBirthday = usersBirthday;
    }

    public void setUsersCreatedAt(Date usersCreatedAt) {
        this.usersCreatedAt = usersCreatedAt;
    }

    public void setUsersUpdatedAt(Date usersUpdatedAt) {
        this.usersUpdatedAt = usersUpdatedAt;
    }


    public int getUsersId() {
        return usersId;
    }

    public String getUsersLoginName() {
        return usersLoginName;
    }

    public String getUsersLoginPassword() {
        return usersLoginPassword;
    }

    public String getUsersName() {
        return usersName;
    }

    public int getUsersAge() {
        return usersAge;
    }

    public Date getUsersBirthday() {
        return usersBirthday;
    }

    public Date getUsersCreatedAt() {
        return usersCreatedAt;
    }

    public Date getUsersUpdatedAt() {
        return usersUpdatedAt;
    }
}
