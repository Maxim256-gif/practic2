class EmailAttractionNotifier extends AbstractAttractionNotifier {
    private String emailAddress;

    public EmailAttractionNotifier(IAttractionNotifier wrappee, String emailAddress) {
        super(wrappee);
        this.emailAddress = emailAddress;
    }

    @Override
    public void notify(AttractionAlert alert) {
        super.notify(alert);
        System.out.println("Sending email to " + emailAddress + ": " + alert.getMessage());
    }
}