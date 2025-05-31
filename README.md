# Airline-Reservation-System-
# ✈️ Airline Reservation System (Java Console App)

A simple airline reservation system built with Java that allows users to add flights, register passengers, and make reservations through a console interface.

## 📁 Package Structure

airlinereservation/
├── main/ # Main class: AirlineApp.java
├── model/ # Data models: Flight.java, Passenger.java, Reservation.java
├── service/ # Business logic: AirlineService.java
## ✅ Features

- Add new flights (with origin and destination)
- Register passengers (by ID and name)
- Book reservations (passenger → flight)
- View list of all flights, passengers, and reservations

## 🛠 How to Run

1. Compile the main file:
   ```bash
   javac airlinereservation/main/AirlineApp.java
Run the program:
java airlinereservation.main.AirlineApp
⚙ Requirements
Java 8 or higher

💡 Future Enhancements
Flight seat availability tracking

Cancel reservation feature

File/database storage

GUI interface using Swing or JavaFX
