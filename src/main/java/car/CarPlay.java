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
		for(int rd = 0; rd<playRound;rd++) {
			move();
		}
	}
	
	public void move() {
		for(Car car : playCars) {
			car.isDrive(RandomNumUtils.getRandomNum());
		}
		MessageCreateUtils.printCurrentStatus(playCars);
	}
	
	public void end() {
		MessageCreateUtils.printResult(getWinner(playCars));
	}

	public void carInput() {
		boolean playYN = false;
		while (!playYN) {
			playCars = new ArrayList<Car>();
			MessageCreateUtils.printCarRaceStart();
			String playCar = scan.next();
			playYN = checkPlayCar(playCar);
		}
	}

	public boolean checkPlayCar(String playCar) {
		String[] arrCar = playCar.split(CarRule.getCarNameCsv());
		for (String strCar : arrCar) {
			createPlayCar(strCar);
		}
		if (arrCar.length == playCars.size()) {
			return true;
		}
		return false;
	}

	public void createPlayCar(String playCar) {
		if (CarValidateUtils.carNameCheck(playCar)) {
			Car car = new Car(playCar, 0);
			playCars.add(car);
		}
	}

	public void roundInput() {
		boolean playYN = false;
		String round = "";
		while (!playYN) {
			MessageCreateUtils.printTryRoundCount();
			round = scan.next();
			playYN = checkRound(round);
		}
		playRound = Integer.parseInt(round);
	}

	public boolean checkRound(String round) {
		return CarValidateUtils.checkRound(round);
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
