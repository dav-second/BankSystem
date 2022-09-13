public class Person {

    private String name;

    private String lastName;

    private int phoneNumber;

    private String Address;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Person(String name, int phoneNumber, String address, String lastName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        Address = address;
        this.lastName = lastName;

    }

    }
