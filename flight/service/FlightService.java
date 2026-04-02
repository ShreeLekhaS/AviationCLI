package com.organization.flight.service;

import com.organization.flight.model.Aviation;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private List<Aviation> flights = new ArrayList<>();

    public FlightService() {
        loadMockData();
    }

    private void loadMockData() {

        flights.add(new Aviation("AI101", "DELHI", "BANGALORE", "2026-04-02", "Scheduled"));
        flights.add(new Aviation("6E203", "BANGALORE", "DELHI", "2026-04-02", "Delayed"));
        flights.add(new Aviation("SG404", "MUMBAI", "CHENNAI", "2026-04-03", "Cancelled"));
        flights.add(new Aviation("UK501", "HYDERABAD", "DELHI", "2026-04-04", "Scheduled"));

        flights.add(new Aviation("AI301", "DELHI", "LONDON", "2026-04-05", "Scheduled"));
        flights.add(new Aviation("BA202", "LONDON", "DELHI", "2026-04-06", "Delayed"));
        flights.add(new Aviation("AF101", "PARIS", "MUMBAI", "2026-04-05", "Scheduled"));
        flights.add(new Aviation("LH505", "FRANKFURT", "BANGALORE", "2026-04-06", "Cancelled"));
        flights.add(new Aviation("EK501", "DUBAI", "DELHI", "2026-04-07", "Scheduled"));
        flights.add(new Aviation("QR702", "DOHA", "CHENNAI", "2026-04-08", "Delayed"));
        flights.add(new Aviation("SQ305", "SINGAPORE", "MUMBAI", "2026-04-09", "Scheduled"));
        flights.add(new Aviation("AI777", "DELHI", "NEWYORK", "2026-04-10", "Scheduled"));
        flights.add(new Aviation("UA101", "NEW YORK", "DELHI", "2026-04-11", "Delayed"));
        flights.add(new Aviation("AI888", "BANGALORE", "TOKYO", "2026-04-12", "Scheduled"));
    }

    public void listAllFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        for (Aviation f : flights) f.display();
    }

    public void searchByFlightNumber(String flightNumber) throws Exception {
        boolean found = false;
        for (Aviation f : flights) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("Flight " + flightNumber + " not found!");
    }

    public void searchByRoute(String origin, String destination) throws Exception {
        boolean found = false;
        for (Aviation f : flights) {
            if (f.origin.equalsIgnoreCase(origin) && f.destination.equalsIgnoreCase(destination)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("No flights found from " + origin + " to " + destination);
    }

    public void searchByDate(String date) throws Exception {
        boolean found = false;
        for (Aviation f : flights) {
            if (f.date.equals(date)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("No flights found on " + date);
    }
}