package car;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Cars {

	private List<Car> cars;
	
	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Car getWinner() {
		//Optional<Car> c = cars.stream().reduce((a, b) -> a.getDistance() > b.getDistance() ? a : b);
		Collections.sort(cars, (car1,car2) -> Integer.compare(car2.getDistance(), car1.getDistance()));	
		//cars.forEach(car -> System.out.println(car.getName()));
		return cars.get(0);
	}
}
