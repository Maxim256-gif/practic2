class AmusementParkAccess implements IAmusementParkProxy {
    private String url;
    private boolean isOperational;

    public AmusementParkAccess(String url) {
        this.url = url;
        this.isOperational = true;
    }

    @Override
    public boolean checkAttractionStatus() {
        return isOperational;
    }

    @Override
    public boolean checkVisitorStatus() {
        return true;
    }

    @Override
    public void open(String url) {
        this.url = url;
        this.isOperational = true;
    }

    @Override
    public void close() {
        this.isOperational = false;
    }

    @Override
    public void startMaintenance() {
        this.isOperational = false;
    }

    @Override
    public void endMaintenance() {
        this.isOperational = true;
    }

    @Override
    public void reserveTicket() {
        if (isOperational) {
            System.out.println("Ticket reserved successfully.");
        } else {
            System.out.println("Park is not operational. Unable to reserve ticket.");
        }
    }

    @Override
    public void cancelTicket() {
        System.out.println("Ticket cancelled successfully.");
    }
}
