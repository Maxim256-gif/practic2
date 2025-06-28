class FerrisWheelStrategy implements AttractionStrategy {
    @Override
    public void operateRide(Attraction attraction) {
        System.out.println("Operating Ferris wheel: " + attraction.getAttractionName());
    }

    @Override
    public void performMaintenance(Attraction attraction) {
        System.out.println("Performing maintenance on Ferris wheel: " + attraction.getAttractionName());
    }

    @Override
    public void shutdownRide(Attraction attraction) {
        System.out.println("Shutting down Ferris wheel: " + attraction.getAttractionName());
    }
}