import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Location location = new Location("USA", "California", "Los Angeles", "Main St", "Downtown", "Dream Park", "Near the beach");
        Technician technician = new Technician("John Doe", LocalDateTime.of(1990, 5, 15, 0, 0), location, "Maintenance", LocalDateTime.of(2020, 1, 10, 0, 0));
        ModernRide modernRide = new ModernRide("Alice", technician, 20, true, RideType.ROLLER_COASTER);
        ClassicRide classicRide = new ClassicRide("Central Park", "Bob");

        RideStorage storage = new RideStorage();
        storage.add(modernRide);
        storage.add(classicRide);

        storage.save("JSON");
        storage.save("Database");
    }
}
