public class Main {
    public static void main(String[] args) {
        AmusementParkAccess parkAccess = new AmusementParkAccess("http://amusementpark.com");
        AmusementParkAccessProxy proxy = new AmusementParkAccessProxy(parkAccess);
        AmusementParkController controller = new AmusementParkController(proxy);

        controller.addAttraction();
        controller.addVisitor();

        proxy.reserveTicket();
        proxy.startMaintenance();
        System.out.println("Attraction operational status: " + proxy.checkAttractionStatus());
        proxy.endMaintenance();
        System.out.println("Attraction operational status: " + proxy.checkAttractionStatus());

        proxy.close();
        System.out.println("Visitor status: " + proxy.checkVisitorStatus());
    }
}
