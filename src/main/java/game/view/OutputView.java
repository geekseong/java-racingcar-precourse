package game.view;

import java.util.List;

import game.car.RacingCar;

public class OutputView {
	private static final String CAR_NAME_INPUT_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RACING_TIME_INPUT_TEXT = "시도할 회수는 몇회인가요?";
	private static final String WINNER_TEXT = "%s가 최종 우승했습니다.";

	public static String carNameInputRequest() {
		return CAR_NAME_INPUT_TEXT;
	}

	public static String racingTimeInputRequest() {
		return RACING_TIME_INPUT_TEXT;
	}

	public static String inTimeRacing(List<RacingCar> racingCarList) {
		StringBuilder resultBuilder = new StringBuilder();
		for (RacingCar racingCar : racingCarList) {
			resultBuilder.append(racingCar.getResult()+"\n");
		}

		return resultBuilder.toString();
	}

	public static String winners(List<RacingCar> racingCarList) {
		StringBuilder resultBuilder = new StringBuilder();
		resultBuilder.append(racingCarList.get(0).getName());
		for (int i = 1; i < racingCarList.size(); i++) {
			resultBuilder.append(", "+racingCarList.get(i).getName());
		}

		return String.format(WINNER_TEXT, resultBuilder.toString());
	}
}
