package utils;

public class CarValidateUtils {

	private final static int CAR_NAME_LIMIT_SIZE = 5;
	private final static int DRIVE_MINIMUM_LIMIT = 4;
	private final static String CAR_NAME_CSV = ",";
	
	private static int ROUND_CNT;
	private static int PASS_CAR_CNT;
	
	public static boolean checkPlayCar(String[] playCar) {
		PASS_CAR_CNT = 0;
		for (String strCar : playCar) {
			carNameCheck(strCar);
		}
		if(PASS_CAR_CNT != playCar.length) {
			MessageCreateUtils.printCarNmaeLimit();
			return false;
		}
		return true;
	}

	public static void carNameCheck(String carName) {
		if(carName.length() <= CAR_NAME_LIMIT_SIZE) {
			PASS_CAR_CNT++;
		}
	}

	public static String getCarNameCsv() {
		return CAR_NAME_CSV;
	}

	public static boolean isDrive(int ranDomNo) {
		return ranDomNo >= DRIVE_MINIMUM_LIMIT;
	}

	public static int getROUND_CNT() {
		return ROUND_CNT;
	}

	public static void setROUND_CNT(int rOUND_CNT) {
		ROUND_CNT = rOUND_CNT;
	}

	public static boolean checkRound(String round) {
		String regex = "[0-9]+";
		if (!round.matches(regex)) {
			MessageCreateUtils.printRoundValidateMsg();
			return false;
		}
		return true;
	}
}
