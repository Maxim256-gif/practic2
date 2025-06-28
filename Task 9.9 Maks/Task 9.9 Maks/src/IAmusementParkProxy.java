interface IAmusementParkProxy {
    boolean checkAttractionStatus();
    boolean checkVisitorStatus();
    void open(String url);
    void close();
    void startMaintenance();
    void endMaintenance();
    void reserveTicket();
    void cancelTicket();
}