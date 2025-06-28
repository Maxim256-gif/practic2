class RideDatabaseVisitor implements RideVisitor {
    @Override
    public String visitVisitor(Visitor visitor) {
        return "Saving visitor: " + visitor;
    }

    @Override
    public String visitTechnician(Technician technician) {
        return "Saving technician: " + technician;
    }

    @Override
    public String visitRideType(RideType type) {
        return "Saving ride type: " + type;
    }

    @Override
    public String visitModern(ModernRide ride) {
        return "Saving modern ride: " + ride;
    }

    @Override
    public String visitClassic(ClassicRide ride) {
        return "Saving classic ride: " + ride;
    }
}