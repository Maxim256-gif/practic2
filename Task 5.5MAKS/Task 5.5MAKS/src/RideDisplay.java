class RideDisplay extends RideComponent {
    private String title;
    private int width;
    private int height;

    public RideDisplay(String name, int width, int height, String title) {
        super(name);
        this.width = width;
        this.height = height;
        this.title = title;
    }

    @Override
    public void processRequest() {
        System.out.println("Processing request for RideDisplay: " + title);
    }
}
