import java.util.ArrayList;
import java.util.List;



class RideStorage {
    private List<Ride> rides = new ArrayList<>();
    private RideVisitor serializer;

    public void add(Ride ride) {
        rides.add(ride);
    }

    public void save() {
        for (Ride ride : rides) {
            System.out.println(ride.accept(serializer));
        }
    }

    public void save(String format) {
        serializer = format.equals("JSON") ? new RideJsonVisitor() : new RideDatabaseVisitor();
        save();
    }
}
