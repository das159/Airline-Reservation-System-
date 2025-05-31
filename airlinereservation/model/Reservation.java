package airlinereservation.model;

public class Reservation {
    private Passenger passenger;
    private Flight flight;

    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation: " + passenger.getName() + " booked " + flight;
    }
}
