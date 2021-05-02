package car;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName("자동차_전진_테스트")
	void carRacingTest() {
		Car car = new Car("K5", 0);
		car.isDrive(4);
		assertThat(car.getDistance()).isEqualTo(1);
		car.isDrive(3);
		assertThat(car.getDistance() == 2).isFalse();
	}
	
	@Test
	@DisplayName("자동차_거리_비교_테스트")
	void carDistanceTest() {
		List<Car> carList = new ArrayList<Car>();
		Car carK7 = new Car("K7", 4);
		Car carK5 = new Car("K5", 0);
		Car carK9 = new Car("K9", 1);
		carList.add(carK5);
		carList.add(carK7);
		carList.add(carK9);
		Cars cars = new Cars(carList);
		assertThat(cars.getWinner().getName()).isEqualTo("K7");
		
	}
}
