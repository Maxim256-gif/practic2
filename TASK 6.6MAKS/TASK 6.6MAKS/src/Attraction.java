class Attraction {
    private String attractionName;
    private int capacity;
    private Operator operator;

    public Attraction(String attractionName, int capacity, Operator operator) {
        this.attractionName = attractionName;
        this.capacity = capacity;
        this.operator = operator;
    }

    public String getAttractionName() {
        return attractionName;
    }

    public int getCapacity() {
        return capacity;
    }

    public Operator getOperator() {
        return operator;
    }
}