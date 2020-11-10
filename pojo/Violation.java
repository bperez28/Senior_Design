import java.util.UUID;

public class Violation {

    private String id;
    private String dateofViolation;
    private int points;
    
    public Violation() {}
	public Violation(String dateofViolation, int points) {
		super();
		id =UUID.randomUUID().toString();
		this.dateofViolation = dateofViolation;
		this.points = points;
	}
	public String getDateofViolation() {
		return dateofViolation;
	}
	public void setDateofViolation(String dateofViolation) {
		this.dateofViolation = dateofViolation;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getId() {
		return id;
	}
    
}
