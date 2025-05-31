package airlinereservation.service;

import airlinereservation.model.Flight;
import airlinereservation.model.Passenger;
import airlinereservation.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class AirlineService {
    private List<Flight> flights = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addFlight(String number, String origin, String destination) {
        flights.add(new Flight(number, origin, destination));
    }

    public void addPassenger(String id, String name) {
        passengers.add(new Passenger(id, name));
    }

    public Flight getFlightByNumber(String number) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(number)) return f;
        }
        return null;
    }

    public Passenger getPassengerById(String id) {
        for (Passenger p : passengers) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public boolean reserve(String passengerId, String flightNumber) {
        Passenger passenger = getPassengerById(passengerId);
        Flight flight = getFlightByNumber(flightNumber);
        if (passenger != null && flight != null) {
            reservations.add(new Reservation(passenger, flight));
            return true;
        }
        return false;
    }

    public List<Flight> getAllFlights() { return flights; }
    public List<Passenger> getAllPassengers() { return passengers; }
    public List<Reservation> getAllReservations() { return reservations; }
}
