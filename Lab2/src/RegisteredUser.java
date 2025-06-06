import java.util.ArrayList;

public class RegisteredUser {
    private ArrayList<User> listOfUser;

    public ArrayList<User> getListOfUser() {
        return listOfUser;
    }

    public void setListOfUser(ArrayList<User> listOfUser) {
        this.listOfUser = listOfUser;
    }

    public void addUser(User user) {
        listOfUser.add(user);
    }

    public void removeUser(User user) {
        listOfUser.remove(user);
    }
}
