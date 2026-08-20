package maven.P;

import java.util.List;

public class FleetUtils {
	public static <T extends Vehicle> T findCheapest(List<T> VList) {
		// i will do a Linear Scan based on DailyRate
		if (VList.size() == 0) {
			throw new IllegalArgumentException("the List is empty");

		}
		if (VList.size() == 1) {
			return VList.get(0);
		}
		T cheapest = VList.get(0);
		for (int i = 1; i < VList.size(); i++) {
			if (cheapest.getDailyRate() > VList.get(i).getDailyRate()) {
				cheapest = VList.get(i);
			}
		}
		return cheapest;

	}

	public static void printAny(List<? extends Vehicle> Vehicles) {
		for (int i = 0; i < Vehicles.size(); i++) {
			System.out.println(Vehicles.get(i).toString());
		}

	}

	public static int countVehicles(List<?> list) {
		return list.size();
	}
}
