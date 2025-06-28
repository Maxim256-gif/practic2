class RollerCoasterStrategy implements AttractionStrategy {
    @Override
    public void operateRide(Attraction attraction) {
        System.out.println("Operating roller coaster: " + attraction.getAttractionName());
    }

    @Override
    public void performMaintenance(Attraction attraction) {
        System.out.println("Performing maintenance on roller coaster: " + attraction.getAttractionName());
    }

    @Override
    public void shutdownRide(Attraction attraction) {
        System.out.println("Shutting down roller coaster: " + attraction.getAttractionName());
    }
}