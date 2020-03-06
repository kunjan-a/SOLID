package solid_2011.live.srp;

public class PersonalInfo {
    private String name;
    private Address address;

    public PersonalInfo(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PersonalInfo() {
    }
}