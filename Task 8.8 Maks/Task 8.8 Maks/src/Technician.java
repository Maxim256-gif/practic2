import java.time.LocalDateTime;

class Technician extends Visitor {
    private String department;
    private LocalDateTime hireDate;

    public Technician(String firstName, LocalDateTime birthDate, Location location, String department, LocalDateTime hireDate) {
        super(firstName, birthDate, location);
        this.department = department;
        this.hireDate = hireDate;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " in department " + department;
    }
}