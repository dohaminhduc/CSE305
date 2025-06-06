package CSE_305_Lab2.Lab5_BuilderPattern;

class Client {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;

    public Client(String contractID, String propertyID, String tenantID, int rentAmount) {
        this.contractID = contractID;
        this.propertyID = propertyID;
        this.tenantID = tenantID;
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "contractID='" + contractID + '\'' +
                ", propertyID='" + propertyID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", rentAmount=" + rentAmount +
                '}';
    }

    public String getContractID() {
        return contractID;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public void setTenantID(String tenantID) {
        this.tenantID = tenantID;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }
}
