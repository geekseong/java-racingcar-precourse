package game.car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import game.exception.ExceptionMessages;
import game.exception.InputInvalidException;

public class RacingCars {
	private final List<RacingCar> racingCars;

	public RacingCars(String names) {
		namesEmptyValidationCheck(names);
		this.racingCars = makeRacingCars(names);
	}

	private void namesEmptyValidationCheck(String names) {
		if (names == null || names.length() == 0) {
			throw new InputInvalidException(ExceptionMessages.CAR_NAMES_INPUT_COUNT_EXCEPTION_MSG);
		}
	}

	private List<RacingCar> makeRacingCars(String names) {
		String[] splitNames = names.split(",");
		List<RacingCar> racingCars = new ArrayList<>(splitNames.length);
		for (String name : splitNames) {
			racingCars.add(new RacingCar(name));
		}
		return racingCars;
	}

	public void accelerate(List<Integer> degreeList) {
		for (int i = 0; i < racingCars.size(); ++i) {
			RacingCar racingCar = racingCars.get(i);
			int criteria = degreeList.get(i);
			racingCar.pushAcceleration(criteria);
		}
	}

	public int getCarCount() {
		return this.racingCars.size();
	}

	public List<RacingCar> getRacingCarList() {
		return this.racingCars;
	}

	public List<RacingCar> getWinners() {
		Collections.sort(this.racingCars);

		int carCount = this.racingCars.size();
		int maxMove = this.racingCars.get(0).getPosition();
		List<RacingCar> winner = new ArrayList<>();
		for (int i = 0; i < carCount && this.racingCars.get(i).getPosition() == maxMove; i++) {
			winner.add(racingCars.get(i));
		}

		return winner;
	}
}
