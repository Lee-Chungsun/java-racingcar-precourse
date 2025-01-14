package car;

import utils.CarValidateUtils;

public class Car {

	private final String name;
	private int distance;

	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	public Car(String name, int distance) {
		this.name = name;
		this.distance = distance;
	}

	public void isDrive(int randomNo) {
		if (CarValidateUtils.isDrive(randomNo)) {
			go();
		}
	}

	public void go() {
		distance++;
	}

}
