package CSE_305.Lab5_BuilderPattern;

public class LongTerm implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private int rentAmount;
    private Contract contract;

    @Override
    public void BuildContractID(String contractID) {
        this.contractID = contractID;
    }

    @Override
    public void BuildPropertyID(String propertyID){
        this.propertyID = propertyID;
    }

    @Override
    public void BuildTenantID(String tenantID){
        this.tenantID = tenantID;
    }

    @Override
    public void BuildRentAmount(int rentAmount){
        this.rentAmount = rentAmount;
    }

    @Override
    public Contract SignContract(Contract contract){
        return this.contract = contract;
    }
}
