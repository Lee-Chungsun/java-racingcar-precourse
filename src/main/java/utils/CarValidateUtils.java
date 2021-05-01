package utils;

public class CarValidateUtils {
	
	public final static int CAR_NAME_LIMIT_SIZE = 5;
	
	public static boolean carNameCheck(String carName) {
		return carName.length() <= CAR_NAME_LIMIT_SIZE;
	}

}
