package car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import utils.CarValidateUtils;
import utils.MessageCreateUtils;
import utils.RandomNumUtils;

public class CarPlay {

	private Scanner scan;
	private int playRound;
	private List<Car> playCars;
	private int winScore;
	private List<String> winCar;

	public CarPlay() {
		scan = new Scanner(System.in);
	}

	public void start() {
		carInput();
		roundInput();
		play();
		end();
	}

	public void play() {
		MessageCreateUtils.printRoundResult();
		for (int rd = 0; rd < playRound; rd++) {
			move();
		}
	}

	public void move() {
		for (Car car : playCars) {
			car.isDrive(RandomNumUtils.getRandomNum());
		}
		MessageCreateUtils.printCurrentStatus(playCars);
	}

	public void end() {
		MessageCreateUtils.printResult(getWinner(playCars));
	}

	public void carInput() {
		boolean playYN = false;
		String playCar = "";
		String[] arrCar = null;
		while (!playYN) {
			playCars = new ArrayList<Car>();
			MessageCreateUtils.printCarRaceStart();
			playCar = scan.next();
			arrCar = playCar.split(CarValidateUtils.getCarNameCsv());
			playYN = CarValidateUtils.checkPlayCar(arrCar);
		}
		for (String strCar : arrCar) {
			Car car = new Car(strCar, 0);
			playCars.add(car);
		}
	}

	public void roundInput() {
		boolean playYN = false;
		String round = "";
		while (!playYN) {
			MessageCreateUtils.printTryRoundCount();
			round = scan.next();
			playYN = CarValidateUtils.checkRound(round);
		}
		playRound = Integer.parseInt(round);
	}

	public List<String> getWinner(List<Car> cars) {
		winCar = new ArrayList<String>();
		Collections.sort(cars, (car1, car2) -> Integer.compare(car2.getDistance(), car1.getDistance()));
		winScore = cars.get(0).getDistance();
		cars.forEach(car -> coWinCar(car));
		return winCar;
	}

	public void coWinCar(Car car) {
		if (car.getDistance() == winScore) {
			winCar.add(car.getName());
		}
	}
}
