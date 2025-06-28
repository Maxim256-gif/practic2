import java.time.LocalDateTime;

interface Ride {
    long getId();
    LocalDateTime getLastMaintenanceDate();
    String accept(RideVisitor visitor);
}