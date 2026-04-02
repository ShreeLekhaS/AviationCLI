package com.organization.flight.model;


public class Aviation {
    public String flightNumber;
    public String origin;
    public String destination;
    public String date;
    public String status;

    public Aviation(String flightNumber, String origin, String destination, String date, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.status = status;
    }

    public void display() {
        System.out.println(flightNumber + " | " + origin + " -> " + destination + " | " + date + " | " + status);
    }

}