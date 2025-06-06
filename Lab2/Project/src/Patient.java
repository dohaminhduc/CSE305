import java.util.ArrayList;

public class Patient extends User{
    private ArrayList<User> patients;


    public Patient(String name, String address, String password, String dateOfBirth, ArrayList<User> patients) {
        super(name, address, password, dateOfBirth);
        this.patients = patients;
    }

    public void addPatient(User user) {
        patients.add(user);
    }

    public void removePatient(User user) {
        patients.remove(user);
    }
}
