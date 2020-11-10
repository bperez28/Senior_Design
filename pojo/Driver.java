import java.util.List;
import java.util.UUID;

public class Driver {

    private String id;
    private String driverLicense;
    private String fname;
    private String minit;
    private String lname;
    private String sex;
    private String dob;
    private String relation;
    private String maritalStatus;
    private String licenseIssued;
    
    private List<Violation> violations;
    
    public Driver() {}
	public Driver(String driverLicense, String fname, String minit, String lname, String sex, String dob,
			String relation, String maritalStatus, String licenseIssued) {
		super();
		id= UUID.randomUUID().toString();
		this.driverLicense = driverLicense;
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.sex = sex;
		this.dob = dob;
		this.relation = relation;
		this.maritalStatus = maritalStatus;
		this.licenseIssued = licenseIssued;
	}
	public String getId() {
		return id;
	}
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMinit() {
		return minit;
	}
	public void setMinit(String minit) {
		this.minit = minit;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getLicenseIssued() {
		return licenseIssued;
	}
	public void setLicenseIssued(String licenseIssued) {
		this.licenseIssued = licenseIssued;
	}
	public Violation getViolation(int i) {
		return violations.get(i);
	}
	public boolean addViolation(Violation violation) {
		violations.add(violation);
		return true;
	}
    
}
