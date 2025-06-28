class RideJsonVisitor implements RideVisitor {
    @Override
    public String visitVisitor(Visitor visitor) {
        return "Exporting visitor to JSON: " + visitor;
    }

    @Override
    public String visitTechnician(Technician technician) {
        return "Exporting technician to JSON: " + technician;
    }

    @Override
    public String visitRideType(RideType type) {
        return "Exporting ride type to JSON: " + type;
    }

    @Override
    public String visitModern(ModernRide ride) {
        return "Exporting modern ride to JSON: " + ride;
    }

    @Override
    public String visitClassic(ClassicRide ride) {
        return "Exporting classic ride to JSON: " + ride;
    }
}
