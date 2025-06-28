import java.time.LocalDateTime;


class Visitor {
    private String firstName;
    private LocalDateTime birthDate;
    private Location location;

    public Visitor(String firstName, LocalDateTime birthDate, Location location) {
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.location = location;
    }

    public long getId() {
        return hashCode();
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return firstName + " from " + location;
    }

    public String accept(RideVisitor visitor) {
        return visitor.visitVisitor(this);
    }
}