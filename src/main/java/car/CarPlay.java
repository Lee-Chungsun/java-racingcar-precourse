package car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarPlay {

	private static int winScore;
	private static List<Car> winCar = new ArrayList<Car>();
	
	public static List<Car> getWinner(List<Car> cars) {
		Collections.sort(cars, (car1, car2) -> Integer.compare(car2.getDistance(), car1.getDistance()));
		winScore = cars.get(0).getDistance();
		cars.forEach(car -> coWinCar(car));
		return winCar;
	}
	
	public static void coWinCar(Car car) {
		if(car.getDistance() == winScore) {
			winCar.add(car);
		}
	}
}
