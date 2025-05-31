package airlinereservation.main;

import airlinereservation.model.Flight;
import airlinereservation.model.Passenger;
import airlinereservation.model.Reservation;
import airlinereservation.service.AirlineService;

import java.util.Scanner;

public class AirlineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirlineService service = new AirlineService();

        while (true) {
            System.out.println("\nAirline Reservation System");
            System.out.println("1. Add Flight");
            System.out.println("2. Add Passenger");
            System.out.println("3. Make Reservation");
            System.out.println("4. View Flights");
            System.out.println("5. View Passengers");
            System.out.println("6. View Reservations");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Flight Number: ");
                    String fn = scanner.nextLine();
                    System.out.print("Origin: ");
                    String origin = scanner.nextLine();
                    System.out.print("Destination: ");
                    String dest = scanner.nextLine();
                    service.addFlight(fn, origin, dest);
                    System.out.println("Flight added.");
                    break;

                case 2:
                    System.out.print("Passenger ID: ");
                    String pid = scanner.nextLine();
                    System.out.print("Passenger Name: ");
                    String pname = scanner.nextLine();
                    service.addPassenger(pid, pname);
                    System.out.println("Passenger added.");
                    break;

                case 3:
                    System.out.print("Passenger ID: ");
                    String rid = scanner.nextLine();
                    System.out.print("Flight Number: ");
                    String rfn = scanner.nextLine();
                    if (service.reserve(rid, rfn)) {
                        System.out.println("Reservation successful.");
                    } else {
                        System.out.println("Reservation failed. Check Passenger ID and Flight Number.");
                    }
                    break;

                case 4:
                    for (Flight f : service.getAllFlights()) {
                        System.out.println(f);
                    }
                    break;

                case 5:
                    for (Passenger p : service.getAllPassengers()) {
                        System.out.println(p);
                    }
                    break;

                case 6:
                    for (Reservation r : service.getAllReservations()) {
                        System.out.println(r);
                    }
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
