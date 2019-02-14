package com.example.dell.finalproject.model;

public class AdminModel implements IAdmin {

    String name;
    String passwd;
    String userName;
    String userAadhar;
    String userPhoneNumber;
    String userPassword;

    public AdminModel(String name, String passwd) {

        this.name = name;
        this.passwd = passwd;
    }

    public AdminModel(String userName, String userAadhar,  String userPhoneNumber,  String userPassword) {
        this.userAadhar=userAadhar;
        this.userPassword=userPassword;
        this.userPhoneNumber=userPhoneNumber;
        this.userName = userName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    @Override
    public int checkUserValidity(String name, String passwd) {
        if (name==null||passwd==null||!name.equals(getName())||!passwd.equals(getPasswd())){
            return -1;
        }
        return 0;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAadhar() {
        return userAadhar;
    }

    public void setUserAadhar(String userAadhar) {
        this.userAadhar = userAadhar;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

}
