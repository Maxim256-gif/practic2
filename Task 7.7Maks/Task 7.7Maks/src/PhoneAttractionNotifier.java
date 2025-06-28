class PhoneAttractionNotifier extends AbstractAttractionNotifier {
    private String phoneNumber;

    public PhoneAttractionNotifier(IAttractionNotifier wrappee, String phoneNumber) {
        super(wrappee);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(AttractionAlert alert) {
        super.notify(alert);
        System.out.println("Sending SMS to " + phoneNumber + ": " + alert.getMessage());
    }
}