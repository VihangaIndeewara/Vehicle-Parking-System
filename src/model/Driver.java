package model;

public class Driver {
    private String name;
    private String nic;
    private String license;
    private String address;
    private int contact;

    public Driver() {
    }

    public Driver(String name, String nic, String license, String address, int contact) {
        this.name = name;
        this.nic = nic;
        this.license = license;
        this.address = address;
        this.contact = contact;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", nic='" + nic + '\'' +
                ", license='" + license + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                '}';
    }
}
