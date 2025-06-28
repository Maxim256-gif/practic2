interface RideVisitor {
    String visitVisitor(Visitor visitor);
    String visitTechnician(Technician technician);
    String visitRideType(RideType type);
    String visitModern(ModernRide ride);
    String visitClassic(ClassicRide ride);
}