package game.car;

import game.exception.ExceptionMessages;
import game.exception.InputInvalidException;
import game.utils.ValidationUtil;

public class CarName {
	private String name;

	public CarName(String name) {
		carNameValidationCheck(name);
		this.name = name.trim();
	}

	public String getName() {
		return name;
	}

	private void carNameValidationCheck(String name) {
		if (!ValidationUtil.isNotEmpty(name)) {
			throw new InputInvalidException(ExceptionMessages.CAR_NAME_INPUT_EMPTY_EXCEPTION_MSG);
		}

		if (!ValidationUtil.isStrLenLessThan5(name)) {
			throw new InputInvalidException(ExceptionMessages.CAR_NAME_INPUT_LENGTH_EXCEPTION_MSG);
		}
	}
}
