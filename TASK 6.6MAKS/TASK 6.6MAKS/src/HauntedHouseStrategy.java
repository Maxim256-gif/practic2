class HauntedHouseStrategy implements AttractionStrategy {
    @Override
    public void operateRide(Attraction attraction) {
        System.out.println("Operating haunted house: " + attraction.getAttractionName());
    }

    @Override
    public void performMaintenance(Attraction attraction) {
        System.out.println("Performing maintenance on haunted house: " + attraction.getAttractionName());
    }

    @Override
    public void shutdownRide(Attraction attraction) {
        System.out.println("Shutting down haunted house: " + attraction.getAttractionName());
    }
}