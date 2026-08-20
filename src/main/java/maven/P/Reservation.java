package maven.P;

public class Reservation implements Cloneable {
	private String customerID;
	private String customerName;
	private Vehicle vehicle;
	private int days;

	public Reservation(String customerID, String customerName, Vehicle vehicle, int days) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.vehicle = vehicle;
		this.days = days;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

}
