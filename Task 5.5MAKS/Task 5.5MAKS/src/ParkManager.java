class ParkManager {
    private RideDisplay rideDisplay;

    public ParkManager(RideDisplay rideDisplay) {
        this.rideDisplay = rideDisplay;
    }

    public void processRequest() {
        System.out.println("ParkManager processing request...");
        rideDisplay.processRequest();
    }

    public RideDisplay getRideDisplay() {
        return rideDisplay;
    }
}
