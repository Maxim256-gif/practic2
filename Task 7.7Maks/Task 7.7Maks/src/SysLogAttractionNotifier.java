class SysLogAttractionNotifier extends AbstractAttractionNotifier {
    private String logName;

    public SysLogAttractionNotifier(IAttractionNotifier wrappee, String logName) {
        super(wrappee);
        this.logName = logName;
    }

    @Override
    public void notify(AttractionAlert alert) {
        super.notify(alert);
        System.out.println("Logging to " + logName + ": " + alert.getMessage());
    }
}
