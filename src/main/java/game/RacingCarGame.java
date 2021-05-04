package game;

import java.util.List;

import game.car.RacingCars;
import game.utils.NumberGeneratorUtil;
import game.view.InputView;
import game.view.Output;
import game.view.OutputView;

public class RacingCarGame {

	public void start() {
		String carNames = carNameInputRequest();
		int racingTime = racingTimeInputRequest();
		RacingCars racingCars = new RacingCars(carNames);

		int racingCarCount = racingCars.getCarCount();
		for (int i = 0; i < racingTime; ++i) {
			List<Integer> accelerationDegreeList = NumberGeneratorUtil.generateNumList(racingCarCount);
			racingCars.accelerate(accelerationDegreeList);
			printInTimeResult(racingCars);
		}

		printWinner(racingCars);
	}

	private String carNameInputRequest() {
		String view = OutputView.carNameInputRequest();
		Output.println(view);
		return InputView.readString();
	}

	private int racingTimeInputRequest() {
		String view = OutputView.racingTimeInputRequest();
		Output.println(view);
		return InputView.readInt();
	}

	private void printInTimeResult(RacingCars racingCars) {
		String view = OutputView.inTimeRacing(racingCars.getRacingCarList());
		Output.println(view);
	}

	private void printWinner(RacingCars racingCars) {
		String view = OutputView.winners(racingCars.getWinners());
		Output.print(view);
	}
}
