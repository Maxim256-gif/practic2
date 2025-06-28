import java.time.LocalDateTime;

class ClassicRide implements Ride {
    private String location;
    private String operator;

    public ClassicRide(String location, String operator) {
        this.location = location;
        this.operator = operator;
    }

    @Override
    public long getId() {
        return hashCode();
    }

    @Override
    public LocalDateTime getLastMaintenanceDate() {
        return LocalDateTime.now();
    }

    @Override
    public String accept(RideVisitor visitor) {
        return visitor.visitClassic(this);
    }

    @Override
    public String toString() {
        return "ClassicRide at " + location + " operated by " + operator;
    }
}