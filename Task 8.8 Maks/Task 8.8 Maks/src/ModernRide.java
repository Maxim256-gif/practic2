import java.time.LocalDateTime;

class ModernRide implements Ride {
    private String owner;
    private Technician technician;
    private int capacity;
    private boolean isHighThrill;
    private RideType type;

    public ModernRide(String owner, Technician technician, int capacity, boolean isHighThrill, RideType type) {
        this.owner = owner;
        this.technician = technician;
        this.capacity = capacity;
        this.isHighThrill = isHighThrill;
        this.type = type;
    }

    @Override
    public long getId() {
        return hashCode();
    }

    @Override
    public LocalDateTime getLastMaintenanceDate() {
        return LocalDateTime.now();
    }

    public String getOwner() {
        return owner;
    }

    public Technician getTechnician() {
        return technician;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isHighThrill() {
        return isHighThrill;
    }

    public RideType getType() {
        return type;
    }

    @Override
    public String accept(RideVisitor visitor) {
        return visitor.visitModern(this);
    }

    @Override
    public String toString() {
        return "ModernRide owned by " + owner + " with capacity " + capacity;
    }
}
