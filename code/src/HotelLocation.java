import metadata.Address;

public class HotelLocation {
    private String name;
    private Address location;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Address getLocation() {
        return location;
    }
    public void setLocation(Address location) {
        this.location = location;
    }
}