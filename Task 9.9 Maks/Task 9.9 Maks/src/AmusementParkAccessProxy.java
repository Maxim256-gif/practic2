class AmusementParkAccessProxy implements IAmusementParkProxy {
    private AmusementParkAccess parkHandle;

    public AmusementParkAccessProxy(AmusementParkAccess parkHandle) {
        this.parkHandle = parkHandle;
    }

    @Override
    public boolean checkAttractionStatus() {
        return parkHandle.checkAttractionStatus();
    }

    @Override
    public boolean checkVisitorStatus() {
        return parkHandle.checkVisitorStatus();
    }

    @Override
    public void open(String url) {
        parkHandle.open(url);
    }

    @Override
    public void close() {
        parkHandle.close();
    }

    @Override
    public void startMaintenance() {
        parkHandle.startMaintenance();
    }

    @Override
    public void endMaintenance() {
        parkHandle.endMaintenance();
    }

    @Override
    public void reserveTicket() {
        parkHandle.reserveTicket();
    }

    @Override
    public void cancelTicket() {
        parkHandle.cancelTicket();
    }
}