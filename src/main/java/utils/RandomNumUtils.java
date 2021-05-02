package utils;

import java.util.Random;

public class RandomNumUtils {

	public static int getRandomNum() {
		Random random = new Random();
		return random.nextInt(10);
	}
}
