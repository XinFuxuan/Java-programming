package day47_constructor;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country="USA";

    public Address() { // consructor method special method no return type, same name as class name,
        // it is used to initialize the instance variables
        System.out.println("address constructor");
        street="Unknown";
        city="Unknown";
        state="Unknown";
        zipCode="Unknown";
    }
    // second constructor, overlaoded constructor to provide shortcut to initialize variable.
    // in same statement:
    public Address(String street, String city, String state, String zipCode){
       // this.street=street;
        setStreet(street); // better way we could set conditions

    }


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
