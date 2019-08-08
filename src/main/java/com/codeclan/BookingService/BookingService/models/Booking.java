package com.codeclan.BookingService.BookingService.models;

public class Booking {

    private Long id;
    private String date;

    public Booking(String date) {
        this.date = date;
    }

    public Booking() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
