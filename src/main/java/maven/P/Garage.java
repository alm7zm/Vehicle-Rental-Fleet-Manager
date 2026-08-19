package maven.P;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {
	private List<T> gList;

	public Garage() {

		gList = new ArrayList<T>();
	}

	public void park(T vehicle) {
		this.gList.add(vehicle);
	}

	public List<T> getAll() {
		return this.gList;
	}

}
