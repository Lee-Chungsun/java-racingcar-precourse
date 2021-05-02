package car;

public class CarRule {

	private static final int DRIVE_MINIMUM_LIMIT = 4;
	private static final String CAR_NAME_CSV = ",";
	private static int ROUND_CNT = 0;

	public static String getCarNameCsv() {
		return CAR_NAME_CSV;
	}

	public static int getROUND_CNT() {
		return ROUND_CNT;
	}

	public static void setROUND_CNT(int rOUND_CNT) {
		ROUND_CNT = rOUND_CNT;
	}

	public static boolean isDrive(int ranDomNo) {
		return ranDomNo >= DRIVE_MINIMUM_LIMIT;
	}
}
