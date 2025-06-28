class AttractionController {
    private Attraction attraction;
    private AttractionStrategy attractionStrategy;

    public AttractionController(Attraction attraction) {
        this.attraction = attraction;
    }

    public void setAttractionStrategy(AttractionStrategy strategy) {
        this.attractionStrategy = strategy;
    }

    public void operateRide() {
        if (attractionStrategy != null) {
            attractionStrategy.operateRide(attraction);
        }
    }

    public void performMaintenance() {
        if (attractionStrategy != null) {
            attractionStrategy.performMaintenance(attraction);
        }
    }

    public void shutdownRide() {
        if (attractionStrategy != null) {
            attractionStrategy.shutdownRide(attraction);
        }
    }
}