class RideButton extends RideComponent {
    private String label;
    private String iconPath;

    public RideButton(String name, String label, String iconPath) {
        super(name);
        this.label = label;
        this.iconPath = iconPath;
    }

    @Override
    public void processRequest() {
        System.out.println("Processing request for RideButton: " + label);
    }
}