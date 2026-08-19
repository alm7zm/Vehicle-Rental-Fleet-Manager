package maven.P;

public class Truck extends Vehicle {
	private double cargoCapacityTons;

	public Truck(String id, String make, String model, double dailyRate, double cargoCapacityTons) {
		super(id, make, model, dailyRate);
		this.cargoCapacityTons = cargoCapacityTons;
	}

	@Override
	public double calculateRentalCost(int days) {

		return getDailyRate() * days + getCargoCapacityTons() * 20 * days;
	}

	public double getCargoCapacityTons() {
		return this.cargoCapacityTons;
	}

}
