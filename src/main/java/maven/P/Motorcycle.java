package maven.P;

public final class Motorcycle extends Vehicle {
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

	@Override
	public String toString() {
		return "Motorcycle [toString()=" + super.toString() + ", engineCC=" + engineCC + "]";
	}
}
