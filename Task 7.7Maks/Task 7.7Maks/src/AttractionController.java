import java.util.ArrayList;
import java.util.List;




class AttractionController {
    private List<AttractionAlert> alertHistory = new ArrayList<>();
    private IAttractionNotifier notifier;

    public AttractionController(IAttractionNotifier notifier) {
        this.notifier = notifier;
    }

    public void informAlert(AttractionAlert alert) {
        alertHistory.add(alert);
        notifier.notify(alert);
    }
}