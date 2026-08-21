package maven.P;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RentalAgency {
	private List<Vehicle> fleet;

	public RentalAgency() {
		this.fleet = new ArrayList<Vehicle>();
	}

	public void addVehicle(Vehicle v) {
		this.fleet.add(v);
	}

	public boolean removeVehicle(String id) {
		for (int i = 0; i < this.fleet.size(); i++) {
			if (this.fleet.get(i).getID().equals(id)) {
				this.fleet.remove(i);
				System.out.println("the vehicle has been deleted");
				return true;
			}
		}
		System.out.println("the vehicle does not exist/ not found");
		return false;
	}

	public Vehicle findById(String id) {
		for (int i = 0; i < this.fleet.size(); i++) {
			if (this.fleet.get(i).getID().equals(id)) {

				System.out.println("the vehicle has been Found");
				return this.fleet.get(i);
			}
		}
		System.out.println("the vehicle does not exist/ not found");
		return null;
	}

	public ArrayList<Vehicle> getAvailableVehicles() {
		ArrayList<Vehicle> AvailableVehicles = new ArrayList<Vehicle>();
		for (int i = 0; i < this.fleet.size(); i++) {
			if (this.fleet.get(i).getAvailable()) {
				AvailableVehicles.add(this.fleet.get(i));
			}

		}
		return AvailableVehicles;
	}

	public void printFleet() {
		System.out.println("three Days of cost for every Vehicle");

		for (int i = 0; i < this.fleet.size(); i++) {

			if (this.fleet.get(i) instanceof Truck) {
				Truck myTruck = (Truck) this.fleet.get(i);
				System.out.println(i + ": " + myTruck.getID() + " " + myTruck.calculateRentalCost(3)
						+ " CargoCapacityTons: " + myTruck.getCargoCapacityTons());
			} else {
				System.out
						.println(i + ": " + this.fleet.get(i).getID() + " " + this.fleet.get(i).calculateRentalCost(3));
			}
		}
	}

	public void sortFleetBy(Comparator<Vehicle> compare) {
		this.fleet.sort(compare);

	}

	public void checkInVehicle(String id, VehicleListener listner) {
		Vehicle vehicle = findById(id);
		vehicle.checkIn();
		listner.onReturn(vehicle);
	}

	// it prints all Vehicles in the fleet using Method Refrecing style
	public void printAllViaMethodRef() {
		// this.fleet.forEach(n->n.toString()); //it can be written this way as well

		// this.fleet.forEach(ContainingType::methodName)
		this.fleet.forEach(Vehicle::toString);
	}

}
