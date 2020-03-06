package solid_2011.live.srp;

public class Address {
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    public String getAddressStreet() {
        return addressStreet;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public Address() {
    }

    public Address(String addressStreet, String addressCity, String addressCountry) {
        this.addressCity=addressCity;
        this.addressCountry=addressCountry;
        this.addressStreet=addressStreet;
    }
}