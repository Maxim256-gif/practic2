abstract class AbstractAttractionNotifier implements IAttractionNotifier {
    protected IAttractionNotifier wrappee;

    public AbstractAttractionNotifier(IAttractionNotifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void notify(AttractionAlert alert) {
        if (wrappee != null) {
            wrappee.notify(alert);
        }
    }
}