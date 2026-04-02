# AviationCLI - Flight Data CLI Application

## Project Description
**AviationCLI** is a **Command Line Interface (CLI) application** that simulates a backend system for airlines. It allows users to view and search flight information using commands, without any graphical interface. This project is designed to help understand **object-oriented programming (OOP)**, CLI interactions, and basic data management concepts in Java.

The application currently **loads mock flight data**, including domestic and international flights. Users can search flights by:

- Flight number
- Route (origin → destination)
- Date

It also allows listing all stored flights and simulates real-world backend operations.

---

## Features

- **Search flights by number**: Quickly find a specific flight.
- **Search flights by route**: Filter flights based on origin and destination.
- **Search flights by date**: Display flights scheduled on a particular date.
- **List all flights**: View all flights in the system.
- **CLI-based interface**: Operates fully through terminal commands.
- **Mock flight data**: Includes domestic and international routes.
- **Exception handling**: Handles invalid inputs and missing data gracefully.

---

## CLI Commands

| Command | Description | Example |
|---------|-------------|---------|
| `list` | List all flights | `list` |
| `flight <flightNumber>` | Search flight by number | `flight AI101` |
| `route <origin> <destination>` | Search flights by route | `route DEL BANGALORE` |
| `date <YYYY-MM-DD>` | Search flights by date | `date 2026-04-02` |
| `exit` | Exit the application | `exit` |

---

## Project Structure
### Class Diagram
![ClassDiagram1](https://github.com/user-attachments/assets/85ba01e4-4600-431f-861d-766e8722aaf5)

### Use Case Diagram
![UseCaseDiagram1](https://github.com/user-attachments/assets/23cafa44-176b-4393-9bd1-1991dc51083e)
