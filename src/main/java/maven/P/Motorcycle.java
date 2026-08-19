package maven.P;

public class Motorcycle extends Vehicle {
	private int engineCC;

	public Motorcycle(String id, String make, String model, double dailyRate, int engineCC) {
		super(id, make, model, dailyRate);
		this.engineCC = engineCC;

	}

	@Override
	public double calculateRentalCost(int days) {
		return getDailyRate() * days * 0.85;
	}

	public int getEngineCC() {
		return this.engineCC;
	}
}
