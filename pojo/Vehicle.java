public class Vehicle {

    private int id;
    private String vin;
    private String make;
    private String model;
    private String year;
    private String garagingZip;
    private String primaryUse;
    private Company agency;
    
    public Vehicle() {}
	public Vehicle(String vin, String make, String model, String year, String garagingZip, String primaryUse) {
		super();
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
		this.garagingZip = garagingZip;
		this.primaryUse = primaryUse;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGaragingZip() {
		return garagingZip;
	}
	public void setGaragingZip(String garagingZip) {
		this.garagingZip = garagingZip;
	}
	public String getPrimaryUse() {
		return primaryUse;
	}
	public void setPrimaryUse(String primaryUse) {
		this.primaryUse = primaryUse;
	}
	public Company getAgency() {
		return agency;
	}
	public void setAgency(Company agency) {
		this.agency = agency;
	}
	public int getId() {
		return id;
	}
	



    
}
