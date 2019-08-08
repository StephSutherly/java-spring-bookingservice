package com.codeclan.BookingService.BookingService.models;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Long id;
    private String name;
    private String town;
    private int starRating;
    private List<Booking> bookedCustomers;

    public Course(String name, String town, int starRating) {
        this.name = name;
        this.town = town;
        this.starRating = starRating;
        this.bookedCustomers = new ArrayList<>();
    }

    public Course() {
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

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public List<Booking> getBookings() {
        return bookedCustomers;
    }

    public void setBookings(List<Booking> bookedCustomers) {
        this.bookedCustomers = bookedCustomers;
    }
}
