import java.util.ArrayList;

public class PropertyOwner extends User {

    public PropertyOwner(String userID, String password, String email, String userType, ArrayList<Property> listOfProperties) {
        super(userID, password, email, userType);
        this.listOfProperties = listOfProperties;
    }

    private ArrayList<Property> listOfProperties;

    public void addProperty(Property property) {
        listOfProperties.add(property);
    }

    public void removeProperty(Property property) {
        listOfProperties.remove(property);
    }
}
