class Location {
    private String country;
    private String region;
    private String city;
    private String street;
    private String district;
    private String parkName;
    private String additionalNotes;

    public Location(String country, String region, String city, String street, String district, String parkName, String additionalNotes) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.district = district;
        this.parkName = parkName;
        this.additionalNotes = additionalNotes;
    }

    @Override
    public String toString() {
        return city + ", " + parkName + ", " + country;
    }
}