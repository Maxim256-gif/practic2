class TelegramAttractionNotifier extends AbstractAttractionNotifier {
    private String userId;

    public TelegramAttractionNotifier(IAttractionNotifier wrappee, String userId) {
        super(wrappee);
        this.userId = userId;
    }

    @Override
    public void notify(AttractionAlert alert) {
        super.notify(alert);
        System.out.println("Sending Telegram message to user " + userId + ": " + alert.getMessage());
    }
}

