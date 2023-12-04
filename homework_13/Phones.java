package com.proftelran.org.homework_13;


public class Phones {

    private String number;
    private PhoneType type;

    public Phones(String number, PhoneType type) {
        this.number = number;
        this.type = type;
    }

    public PhoneType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Phone{number='" + number + '\'' + ", type=" + type + '}';
    }
}

enum PhoneType {
    MOBILE, STATIONARY
}
