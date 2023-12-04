package com.proftelran.org.homework_13;

import java.util.List;

public class Client {
    private int id;
    private String name;
    private int age;
    private List<Phones> phones;

    public Client(int id, String name, int age, List<Phones> phones) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phones = phones;
    }

    public int getAge() {
        return age;
    }

    public List<Phones> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Client{id=" + id + ", name='" + name + '\'' + ", age=" + age + ", phones=" + phones + '}';
    }
}