package utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import utils.CarValidateUtils;

public class CarValidateUtilsTest {

	@ParameterizedTest
	@ValueSource(strings = {"ionic,k8,koran"})
	@DisplayName("자동차_이름_검증")
	void carNameValidate(String carName) {
		String[] carNameArr = carName.split(",");
		CarValidateUtils cv = new CarValidateUtils();
		
		for(String car : carNameArr) {
			assertThat(cv.carNameCheck(car)).isTrue();
		}
	}

}
