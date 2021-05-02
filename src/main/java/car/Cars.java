package car;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Cars {

	private List<Car> cars;
	
	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
}
