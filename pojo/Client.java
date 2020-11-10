import java.util.UUID;

public class Client {

	private String id;
    private String fname;
    private String lname;
    private String minit;
    private String email;
    private String streetAddress;
    private String state;
    private String city;
    private String zip;
    private String dob;
    private String phoneNum;

    private Company companyId;
    private AutoPolicy autoPolicy;
    private HomePolicy homePolicy;
    

    public Client() {}
    public Client(String fname, String lname, String minit, String email, String streetAddress, String state,
			String city, String zip, String dob, String phoneNum) {
		super();
		id= UUID.randomUUID().toString();
		this.fname = fname;
		this.lname = lname;
		this.minit = minit;
		this.email = email;
		this.streetAddress = streetAddress;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.dob = dob;
		this.phoneNum = phoneNum;
	}
	public String getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMinit() {
		return minit;
	}
	public void setMinit(String minit) {
		this.minit = minit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Company getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Company companyId) {
		this.companyId = companyId;
	}
	public AutoPolicy getAutoPolicy() {
		return autoPolicy;
	}
	public void setAutoPolicy(AutoPolicy autoPolicy) {
		this.autoPolicy = autoPolicy;
	}
	public HomePolicy getHomePolicy() {
		return homePolicy;
	}
	public void setHomePolicy(HomePolicy homePolicy) {
		this.homePolicy = homePolicy;
	}



}