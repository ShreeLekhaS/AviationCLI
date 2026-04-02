# AviationCLI - Flight Data CLI Application

## Overview
**AviationCLI** is a **command-line application** that works like a mini airline backend. It lets you **search and view flight information directly from the terminal**—no GUI needed!  

This project is perfect for learning **Java, object-oriented programming (OOP), and CLI-based applications**. Currently, it uses **mock flight data** (domestic and international) to simulate real-world airline operations.

You can search for flights by:

- Flight number  
- Route (from one city to another)  
- Date  

You can also list all flights, just like a real backend system.

---

## Features

- **Search by flight number** – Quickly find a specific flight.  
- **Search by route** – See all flights between two cities.  
- **Search by date** – Check flights on a particular day.  
- **List all flights** – View all flights stored in the system.  
- **CLI-based interface** – Everything runs in the terminal.  
- **Mock flight data** – Includes sample domestic and international flights.  
- **Error handling** – Shows clear messages for invalid input or missing data.  

---

## CLI Commands

| Command | Description | Example |
|---------|-------------|---------|
| `list` | Show all flights | `list` |
| `flight <flightNumber>` | Find a flight by its number | `flight AI101` |
| `route <origin> <destination>` | Find flights between two cities | `route DEL BANGALORE` |
| `date <YYYY-MM-DD>` | Find flights on a specific date | `date 2026-04-02` |
| `exit` | Exit the application | `exit` |

---
## Project Structure
### Class Diagram:
![ClassDiagram1](https://github.com/user-attachments/assets/85ba01e4-4600-431f-861d-766e8722aaf5)

### Use Case Diagram:
![UseCaseDiagram1](https://github.com/user-attachments/assets/23cafa44-176b-4393-9bd1-1991dc51083e)
