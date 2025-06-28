class ApplicationManager {
    private AttractionController attractionController;

    public ApplicationManager(String rideType) {
        Operator operator = new Operator("John", "Doe");
        Attraction attraction = new Attraction(rideType, 50, operator);
        this.attractionController = new AttractionController(attraction);

        switch (rideType) {
            case "HauntedHouse":
                attractionController.setAttractionStrategy(new HauntedHouseStrategy());
                break;
            case "WaterRide":
                attractionController.setAttractionStrategy(new WaterRideStrategy());
                break;
            case "FerrisWheel":
                attractionController.setAttractionStrategy(new FerrisWheelStrategy());
                break;
            case "RollerCoaster":
                attractionController.setAttractionStrategy(new RollerCoasterStrategy());
                break;
            default:
                System.out.println("Unknown ride type");
                break;
        }
    }

    public void run() {
        attractionController.operateRide();
        attractionController.performMaintenance();
        attractionController.shutdownRide();
    }
}
