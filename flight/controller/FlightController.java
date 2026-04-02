package com.organization.flight.controller;

import com.organization.flight.service.FlightService;

import java.util.Scanner;

public class FlightController {
    private FlightService service;

    public FlightController(FlightService service) {
        this.service = service;
    }

    public void startCLI() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nCommands:");
            System.out.println("* List all flights -> list :");
            System.out.println("* Search by flight number -> flight <flightNumber> :");
            System.out.println("* Search by route -> route <origin> <dest> :");
            System.out.println("* Search by date -> date <YYYY-MM-DD> :");
            System.out.println("* Exit CLI -> exit");
            System.out.print(">> ");

            String input = sc.nextLine();
            String[] cmd = input.split(" ");

            try {
                switch (cmd[0].toLowerCase()) {
                    case "list":
                        service.listAllFlights();
                        break;
                    case "flight":
                        if (cmd.length > 1) service.searchByFlightNumber(cmd[1]);
                        else System.out.println("Enter flight number!");
                        break;
                    case "route":
                        if (cmd.length > 2) service.searchByRoute(cmd[1], cmd[2]);
                        else System.out.println("Enter origin and destination!");
                        break;
                    case "date":
                        if (cmd.length > 1) service.searchByDate(cmd[1]);
                        else System.out.println("Enter date!");
                        break;
                    case "exit":
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    default:
                        System.out.println("Unknown command!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}