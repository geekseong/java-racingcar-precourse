package game.view;

import java.util.List;

import game.car.RacingCar;

public class OutputView {
	private static final String WINNER_TEXT = "%s가 최종 우승했습니다.";
	private static final String RACING_RESULT_TEMPLATE = "%s: %s";

	public static String racingCarCurrentPosition(RacingCar racingCar) {
		return String.format(RACING_RESULT_TEMPLATE, racingCar.getName(), racingCar.getPositionToString());
	}

	public static String inTimeRacing(List<RacingCar> racingCarList) {
		StringBuilder resultBuilder = new StringBuilder();
		for (RacingCar racingCar : racingCarList) {
			resultBuilder.append(racingCarCurrentPosition(racingCar) + "\n");
		}

		return resultBuilder.toString();
	}

	public static String winners(List<RacingCar> racingCarList) {
		StringBuilder resultBuilder = new StringBuilder();
		resultBuilder.append(racingCarList.get(0).getName());
		for (int i = 1; i < racingCarList.size(); i++) {
			resultBuilder.append(", " + racingCarList.get(i).getName());
		}

		return String.format(WINNER_TEXT, resultBuilder.toString());
	}
}
