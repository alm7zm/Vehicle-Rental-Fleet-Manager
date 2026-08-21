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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public final String getID() {
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

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", make=" + make + ", model=" + model + ", dailyRate=" + dailyRate + ", available="
				+ available + "]";
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
