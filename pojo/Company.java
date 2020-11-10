import java.util.UUID;

public class Company {

	private String id;
    private String name;
    private String website;
    private String streetAddress;
    private String state;
    private String city;
    private String zip;
    private String phoneNum;
    
    public Company() {}
    public Company(String name, String website, String streetAddress, String state, String city, String zip,
			String phoneNum) {
		super();
		id= UUID.randomUUID().toString();
		this.name = name;
		this.website = website;
		this.streetAddress = streetAddress;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phoneNum = phoneNum;
	}

	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
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

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
    
}
