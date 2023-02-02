package oops;

public class Address {
	private int floorNumber;
    private String streetName;
    private String cityName;
    private String state;
    private String country;
    public Address(int floorNumber, String streetName, String cityName, String state, String country) {
        this.floorNumber = floorNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.state = state;
        this.country = country;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
