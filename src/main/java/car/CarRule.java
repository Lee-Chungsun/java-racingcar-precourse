package car;

public class CarRule {

	private static final int DRIVE_MINIMUM_LIMIT = 4;
	
	public static boolean isDrive(int i) {
		return i >= DRIVE_MINIMUM_LIMIT;
	}
}
