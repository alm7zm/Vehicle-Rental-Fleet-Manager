package maven.P;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String id, String make, String model, double dailyRate, int numDoors) {
		super(id, make, model, dailyRate);
		this.numDoors = numDoors;
	}

	@Override
	public double calculateRentalCost(int days) {
		return getDailyRate() * days + 5 * days;
	}

	public int getNumDoors() {
		return this.numDoors;
	}

}
