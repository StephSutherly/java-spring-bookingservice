package com.codeclan.BookingService.BookingService.models;

public class Customer {

    private Long id;
    private String name;
    private String town;
    private int age;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public Customer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
