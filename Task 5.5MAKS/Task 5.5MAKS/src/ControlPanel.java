class ControlPanel extends RideComponent {
    private int width;
    private int height;

    public ControlPanel(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void processRequest() {
        System.out.println("Processing request for ControlPanel: " + name);
    }
}
