import java.util.UUID;

public class HomePolicy {

    private String id;
    private String policyNum;
    private String policyStartDate;
    private String policyEndDate;
    
    public HomePolicy() {}
	public HomePolicy(String policyNum, String policyStartDate, String policyEndDate) {
		super();
		id = UUID.randomUUID().toString();
		this.policyNum = policyNum;
		this.policyStartDate = policyStartDate;
		this.policyEndDate = policyEndDate;
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
	public String getId() {
		return id;
	}
    
}
