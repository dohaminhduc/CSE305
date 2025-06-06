package CSE_305_Lab2.Lab5_BuilderPattern;

public class ShortTerm implements Contract{
    private String contractID;
    private int rentAmount;
    private String tenantID;    
    private String propertyID;
    private Contract contract;

    @Override
    public void BuildContractID(String contractID){
        this.contractID = contractID;
    }

    @Override
    public void BuildRentAmount(int rentAmount){
        this.rentAmount = rentAmount;
    }

    @Override
    public void BuildTenantID(String tenantID){
        this.tenantID = tenantID;
    }

    @Override   
    public void BuildPropertyID(String propertyID){
        this.propertyID = propertyID;
    }

    @Override
    public Contract SignContract(Contract contract){
        return this.contract = contract;
    }
}
