package utils;

public class CarValidateUtils {

	private final static int DRIVE_MINIMUM_LIMIT = 4;
	private final static String CAR_NAME_CSV = ",";
	private final static int CAR_NAME_LIMIT_SIZE = 5;

	public static boolean carNameCheck(String carName) {
		return carName.length() <= CAR_NAME_LIMIT_SIZE;
	}

	public static String getCarNameCsv() {
		return CAR_NAME_CSV;
	}

	public static boolean isDrive(int ranDomNo) {
		return ranDomNo >= DRIVE_MINIMUM_LIMIT;
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
