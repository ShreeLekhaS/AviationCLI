package com.organization.flight.service;

import com.organization.flight.model.Aviation;
import com.organization.flight.repository.FlightRepository;

import java.util.List;

public class FlightService {

    private FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    public void listAllFlights() {
        List<Aviation> flights = repository.getAllFlights();
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        for (Aviation f : flights) f.display();
    }

    public void searchByFlightNumber(String flightNumber) throws Exception {
        boolean found = false;
        for (Aviation f : repository.getAllFlights()) {
            if (f.flightNumber.equalsIgnoreCase(flightNumber)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("Flight " + flightNumber + " not found!");
    }

    public void searchByRoute(String origin, String destination) throws Exception {
        boolean found = false;
        for (Aviation f : repository.getAllFlights()) {
            if (f.origin.equalsIgnoreCase(origin) && f.destination.equalsIgnoreCase(destination)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("No flights found from " + origin + " to " + destination);
    }

    public void searchByDate(String date) throws Exception {
        boolean found = false;
        for (Aviation f : repository.getAllFlights()) {
            if (f.date.equals(date)) {
                f.display();
                found = true;
            }
        }
        if (!found) throw new Exception("No flights found on " + date);
    }
}