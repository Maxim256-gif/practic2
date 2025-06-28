class AmusementParkController {
    private IAmusementParkProxy parkHandle;

    public AmusementParkController(IAmusementParkProxy parkHandle) {
        this.parkHandle = parkHandle;
    }

    public void addAttraction() {
        System.out.println("Attraction added.");
    }

    public void removeAttraction() {
        System.out.println("Attraction removed.");
    }

    public void modifyAttraction() {
        System.out.println("Attraction modified.");
    }

    public void addVisitor() {
        System.out.println("Visitor added.");
    }

    public void removeVisitor() {
        System.out.println("Visitor removed.");
    }
}
