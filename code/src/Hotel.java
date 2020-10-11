import java.util.List;

public class Hotel {
    private String name;
    private List<HotelLocation> locations;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<HotelLocation> getLocations() {
        return locations;
    }
    public void setLocations(List<HotelLocation> locations) {
        this.locations = locations;
    }

    public void addLocation(HotelLocation location) {
        locations.add(location);
    }
}