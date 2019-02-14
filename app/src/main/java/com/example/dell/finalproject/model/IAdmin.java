package com.example.dell.finalproject.model;

public interface IAdmin {
    String getName();

    String getPasswd();

    int checkUserValidity(String name, String passwd);
}
