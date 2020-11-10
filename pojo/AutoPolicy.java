import java.util.List;
import java.util.UUID;

public class AutoPolicy{

	private String id;
    private String policyNum;
    private String policyStartDate;
    private String policyEndDate;
    private String garagingAddress;

    private Company underwritingCompany;
    private Company agency;
    private List<Vehicle> coveredVehicles;
    private List<HouseholdMember> householdMembers;
    private List<Driver> coveredDrivers;
    
    public AutoPolicy() {};
    public AutoPolicy(String policyNum, String policyStartDate, String policyEndDate, String garagingAddress) {
		super();
		id= UUID.randomUUID().toString();
		this.policyNum = policyNum;
		this.policyStartDate = policyStartDate;
		this.policyEndDate = policyEndDate;
		this.garagingAddress = garagingAddress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPolicyNum() {
		return policyNum;
	}
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public String getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolicyEndDate(String policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public String getGaragingAddress() {
		return garagingAddress;
	}
	public void setGaragingAddress(String garagingAddress) {
		this.garagingAddress = garagingAddress;
	}
	public Company getUnderwritingCompany() {
		return underwritingCompany;
	}
	public void setUnderwritingCompany(Company underwritingCompany) {
		this.underwritingCompany = underwritingCompany;
	}
	public Company getAgency() {
		return agency;
	}
	public void setAgency(Company agency) {
		this.agency = agency;
	}
	public Vehicle getVehicle(int i) {
		return coveredVehicles.get(i);
	}
	public boolean addVehicle(Vehicle vehicle) {
		coveredVehicles.add(vehicle);
		return true;
	}
	public HouseholdMember getHouseholdMembers(int i) {
		return householdMembers.get(i);
	}
	public boolean addHouseholdMembers(HouseholdMember householdMember) {
		householdMembers.add(householdMember);
		return true;
	}
	public Driver getDriverd(int i) {
		return coveredDrivers.get(i);
	}
	public boolean addDriver(Driver driver) {
		coveredDrivers.add(driver);
		return true;
	}

}
