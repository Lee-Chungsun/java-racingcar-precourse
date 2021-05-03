package utils;

import java.util.List;

import car.Car;

public class MessageCreateUtils {

	private final static String CAR_RACE_START = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
	private final static String CAR_NAME_LIMIT = "자동차의 이름은 5자리 이하입니다.";
	private final static String CAR_CNT_LIMIT = "참가 자동차는 2대 이상이어야 합니다.";
	private final static String TRY_ROUND_COUNT = "시도할 회수는 몇 회인가요?";
	private final static String ROUND_RESULT = "실행 결과";
	private final static String ROUND_VALIDATE_MSG = "회수는  숫자만 입력 가능합니다.";
	private final static String RESULT_MSG = "가 최종 우승했습니다.";
	private final static String DISTANCE_MARK = "-";
	private final static String MSG_CSV = " : ";

	public static void printCarRaceStart() {
		print(CAR_RACE_START);
	}

	public static void printCarNmaeLimit() {
		print(CAR_NAME_LIMIT);
	}
	
	public static void printCarCntLimit() {
		print(CAR_CNT_LIMIT);
	}
	
	public static void printTryRoundCount() {
		print(TRY_ROUND_COUNT);
	}

	public static void printRoundResult() {
		print(ROUND_RESULT);
	}

	public static void printRoundValidateMsg() {
		print(ROUND_VALIDATE_MSG);
	}

	public static void print(String msg) {
		System.out.println(msg);
	}

	public static void printCurrentStatus(List<Car> playCar) {
		playCar.forEach(car -> System.out.println(car.getName() + MSG_CSV + status(car.getDistance())));
		System.out.println();
	}

	public static String status(int distance) {
		String dis = DISTANCE_MARK;
		for (int i = 0; i < distance; i++) {
			dis += DISTANCE_MARK;
		}
		return dis;
	}

	public static void printResult(List<String> winCar) {
		print(String.join(", ", winCar) + RESULT_MSG);
	}
}
