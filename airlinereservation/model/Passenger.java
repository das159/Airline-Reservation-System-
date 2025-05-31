package airlinereservation.model;

public class Passenger {
    private String id;
    private String name;

    public Passenger(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "Passenger[ID=" + id + ", Name=" + name + "]";
    }
}
