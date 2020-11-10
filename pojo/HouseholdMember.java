import java.util.UUID;

public class HouseholdMember {

    private String id;
    private String fname;
    private String minit;
    private String lname;
    private String sex;
    private String dob;
    private String relation;
    private boolean active;
    
    public HouseholdMember() {}
	public HouseholdMember(String fname, String minit, String lname, String sex, String dob, String relation,
			boolean active) {
		super();
		id= UUID.randomUUID().toString();
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.sex = sex;
		this.dob = dob;
		this.relation = relation;
		this.active = active;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    

}
