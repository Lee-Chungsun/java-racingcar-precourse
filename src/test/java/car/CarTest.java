package car;

import static org.assertj.core.api.Assertions.assertThat;

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
}
