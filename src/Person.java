public class Person {
    private String licenseNumber;
    private String name;
    private String surname;
    private String address;

    public Person(String licenseNumber, String name, String surname, String address) {
        this.licenseNumber = licenseNumber;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for surname
    public String getSurname() {
        return surname;
    }

    // Getter for address
    public String getAddress() {
        return address;
    }

    // Getter for license number
    public String getLicenseNumber() {
        return licenseNumber;
    }
}
