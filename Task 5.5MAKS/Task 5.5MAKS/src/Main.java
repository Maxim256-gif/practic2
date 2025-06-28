public class Main {
    public static void main(String[] args) {
        RideDisplay rideDisplay = new RideDisplay("MainRide", 800, 600, "Roller Coaster");

        ControlPanel controlPanel = new ControlPanel("MainControl", 400, 300);

        RideButton startButton = new RideButton("StartButton", "Start", "/icons/start.png");
        RideButton stopButton = new RideButton("StopButton", "Stop", "/icons/stop.png");

        controlPanel.addComponent(startButton);
        controlPanel.addComponent(stopButton);

        rideDisplay.addComponent(controlPanel);

        ParkManager parkManager = new ParkManager(rideDisplay);

        System.out.println("\n--- Processing Requests ---");
        parkManager.processRequest();
        controlPanel.processRequest();
        startButton.processRequest();
        stopButton.processRequest();

        System.out.println("\n--- Removing Start Button ---");
        controlPanel.removeComponent("StartButton");

        System.out.println("\n--- Trying to Process Removed Button ---");
        if (controlPanel.childComponents.containsKey("StartButton")) {
            controlPanel.childComponents.get("StartButton").processRequest();
        } else {
            System.out.println("StartButton has been removed.");
        }
    }
}