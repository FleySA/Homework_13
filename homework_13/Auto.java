package com.proftelran.org.homework_13;

public class Auto {
    private String number;
    private String color;
    private String brand;
    private int mileage;
    private int price;

    public Auto(String number, String color, String brand, int mileage, int price) {
        this.number = number;
        this.color = color;
        this.brand = brand;
        this.mileage = mileage;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Auto{number='" + number + "', color='" + color + "', brand='" + brand + "', mileage=" + mileage + ", price=" + price + '}';
    }
}
