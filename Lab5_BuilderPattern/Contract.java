package CSE_305_Lab2.Lab5_BuilderPattern;

public interface Contract {
    void BuildContractID(String contractID);

    void BuildPropertyID(String propertyID);

    void BuildTenantID(String tenantID);

    void BuildRentAmount(int rentAmount);

    Contract SignContract(Contract contract);
}
