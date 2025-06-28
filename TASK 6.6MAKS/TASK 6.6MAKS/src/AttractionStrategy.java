interface AttractionStrategy {
    void operateRide(Attraction attraction);
    void performMaintenance(Attraction attraction);
    void shutdownRide(Attraction attraction);
}