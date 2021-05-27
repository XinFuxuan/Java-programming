package day47_constructor;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country="USA";

    public void setStreet(String street) { this.street = street;}
    public String getStreet() { return street; }

    public void setCity(String city){this.city=city;}
    public String getCity(){return city;}

    @Override
    public String toString() {
        return street+", "+city+", "+state+", "+zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
