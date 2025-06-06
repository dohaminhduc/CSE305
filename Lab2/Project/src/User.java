public class User {
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private String name;
    private String address;
    private String password;
    private String dateOfBirth;

    public User(String name, String address, String password, String dateOfBirth) {
        this.name = name;
        this.address = address;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }


}
