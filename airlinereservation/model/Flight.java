package airlinereservation.model;

public class Flight {
    private String flightNumber;
    private String origin;
    private String destination;

    public Flight(String flightNumber, String origin, String destination) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getOrigin() { return origin; }
    public String getDestination() { return destination; }

    @Override
    public String toString() {
        return "Flight[" + flightNumber + " from " + origin + " to " + destination + "]";
    }
}
