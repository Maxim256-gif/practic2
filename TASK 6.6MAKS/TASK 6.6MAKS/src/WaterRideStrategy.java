class WaterRideStrategy implements AttractionStrategy {
    @Override
    public void operateRide(Attraction attraction) {
        System.out.println("Operating water ride: " + attraction.getAttractionName());
    }

    @Override
    public void performMaintenance(Attraction attraction) {
        System.out.println("Performing maintenance on water ride: " + attraction.getAttractionName());
    }

    @Override
    public void shutdownRide(Attraction attraction) {
        System.out.println("Shutting down water ride: " + attraction.getAttractionName());
    }
}
