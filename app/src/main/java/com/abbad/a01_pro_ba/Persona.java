package com.abbad.a01_pro_ba;

public class Persona {
    //конструктор полей контакта. Ну и сам клас контакта.
    private  String firstName;
    private  String secondName;
    private  String family;
    private  String mobileNumber;
    private  String homeNumber;
    private  String notice;

    public Persona (String firstName, String secondName, String family,String mobileNumber, String homeNumber, String notice) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.family = family;
        this.mobileNumber = mobileNumber;
        this.homeNumber = homeNumber;
        this.notice = notice;
    }
    // сеттеры и геттеры на об*явленные поля. Автогенерация.
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
