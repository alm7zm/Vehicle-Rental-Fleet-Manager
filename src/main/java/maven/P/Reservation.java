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

}
