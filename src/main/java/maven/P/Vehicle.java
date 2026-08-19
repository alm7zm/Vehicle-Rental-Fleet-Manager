package maven.P;

public abstract class Vehicle implements Comparable<Vehicle> {
	private String id;
	private String make;
	private String model;
	private double dailyRate;
	private boolean available;

	public Vehicle(String id, String make, String model, double dailyRate) {
		this.id = id;
		this.make = make;
		this.model = model;
		if (dailyRate <= 0) {
			throw new IllegalArgumentException("Daily Rate can't be 0 or less " + dailyRate);
		}

		this.dailyRate = dailyRate;
		this.available = true;
	}

	public abstract double calculateRentalCost(int days);

	public void checkOut() {
		if (!available) {
			throw new IllegalStateException("it is already out");
		}
		this.available = false;
	}

	public void checkIn() {
		this.available = true;
	}

	public String getID() {
		return this.id;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return model;
	}

	public double getDailyRate() {
		return this.dailyRate;
	}

	public boolean getAvailable() {
		return this.available;
	}

	public String toString() {
		return "\n id: " + getID() + "\n make: " + getMake() + "\n model: " + getModel() + "\n dailyRate: "
				+ getDailyRate() + "\n available: " + getAvailable();

	}

	public int compareTo(Vehicle other) {
		if (getDailyRate() > other.getDailyRate()) {
			return 1;
		} else if (getDailyRate() < other.getDailyRate()) {
			return -1;
		} else {
			return 0;
		}
	}

}
