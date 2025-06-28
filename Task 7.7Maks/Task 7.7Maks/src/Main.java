public class Main {
    public static void main(String[] args) {
        IAttractionNotifier baseNotifier = new SysLogAttractionNotifier(null, "SystemLog");
        IAttractionNotifier emailNotifier = new EmailAttractionNotifier(baseNotifier, "admin@example.com");
        IAttractionNotifier phoneNotifier = new PhoneAttractionNotifier(emailNotifier, "+123456789");
        IAttractionNotifier telegramNotifier = new TelegramAttractionNotifier(phoneNotifier, "user123");

        AttractionController controller = new AttractionController(telegramNotifier);

        AttractionAlert alert = new AttractionAlert(
                AttractionAlertSeverity.CRITICAL,
                "Fire detected on roller coaster!",
                101,
                "RollerCoaster"
        );

        controller.informAlert(alert);
    }
}