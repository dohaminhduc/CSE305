import java.util.ArrayList;

public class Doctor extends User{
    private ArrayList<Patient> patients;

    public Doctor(String name, String address, String password, String dateOfBirth, ArrayList<Patient> patients) {
        super(name, address, password, dateOfBirth);
        this.patients = patients;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }


}
