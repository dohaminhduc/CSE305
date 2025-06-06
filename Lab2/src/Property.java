public class Property{
    public String getPropertyID() {
        return propertyID;
    }

    public String getDescription() {
        return description;
    }

    public String getPropertyOwnerID() {
        return PropertyOwnerID;
    }

    private String propertyID;
    private String description;
    private String PropertyOwnerID;

    public Property(String propertyID, String description, String PropertyOwnerID) {
        this.propertyID = propertyID;
        this.description = description;
        this.PropertyOwnerID = PropertyOwnerID;
    }

}
