package game.car;

import game.validation.ValidationUtil;

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
			throw new RuntimeException();
		}

		if (!ValidationUtil.isStrLenLessThan5(name)) {
			throw new RuntimeException();
		}
	}
}
