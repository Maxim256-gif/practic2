public class Main {
    public static void main(String[] args) {
        ApplicationManager hauntedHouseManager = new ApplicationManager("HauntedHouse");
        System.out.println("\n--- Haunted House Operations ---");
        hauntedHouseManager.run();

        ApplicationManager waterRideManager = new ApplicationManager("WaterRide");
        System.out.println("\n--- Water Ride Operations ---");
        waterRideManager.run();

        ApplicationManager ferrisWheelManager = new ApplicationManager("FerrisWheel");
        System.out.println("\n--- Ferris Wheel Operations ---");
        ferrisWheelManager.run();

        ApplicationManager rollerCoasterManager = new ApplicationManager("RollerCoaster");
        System.out.println("\n--- Roller Coaster Operations ---");
        rollerCoasterManager.run();
    }
}