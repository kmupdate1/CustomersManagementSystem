package Entity;

import java.util.Date;

public class Customer {
    private int customersId;
    private String customersName;
    private int customersAge;
    private Date customersBirthday;
    private String customersZip;
    private String customersAddress;
    private String customersPhone;
    private Date customersCreatedAt;
    private Date customersUpdatedAt;

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public void setCustomersAge(int customersAge) {
        this.customersAge = customersAge;
    }

    public void setCustomersBirthday(Date customersBirthday) {
        this.customersBirthday = customersBirthday;
    }

    public void setCustomersZip(String customersZip) {
        this.customersZip = customersZip;
    }

    public void setCustomersAddress(String customersAddress) {
        this.customersAddress = customersAddress;
    }

    public void setCustomersPhone(String customersPhone) {
        this.customersPhone = customersPhone;
    }

    public void setCustomersCreatedAt(Date customersCreatedAt) {
        this.customersCreatedAt = customersCreatedAt;
    }

    public void setCustomersUpdatedAt(Date customersUpdatedAt) {
        this.customersUpdatedAt = customersUpdatedAt;
    }


    public int getCustomersId() {
        return customersId;
    }

    public String getCustomersName() {
        return customersName;
    }

    public int getCustomersAge() {
        return customersAge;
    }

    public Date getCustomersBirthday() {
        return customersBirthday;
    }

    public String getCustomersZip() {
        return customersZip;
    }

    public String getCustomersAddress() {
        return customersAddress;
    }

    public String getCustomersPhone() {
        return customersPhone;
    }

    public Date getCustomersCreatedAt() {
        return customersCreatedAt;
    }

    public Date getCustomersUpdatedAt() {
        return customersUpdatedAt;
    }

}
