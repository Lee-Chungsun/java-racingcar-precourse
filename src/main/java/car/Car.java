package car;

public class Car {

	private final String name;
	private int distance;
	
	public String getName() {
		return name;
	}

	public int getDistance() {
		return distance;
	}

	public Car(String string, int i) {
		this.name = string;
		this.distance = i;
	}

	public void isDrive(int i) {
		if(CarRule.isDrive(i)) {
			go();
		}
	}
	
	public void go() {
		distance++;
	}

}
