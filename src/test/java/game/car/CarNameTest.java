package game.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import game.exception.ExceptionMessages;
import game.exception.InputInvalidException;

public class CarNameTest {

	@ParameterizedTest
	@CsvSource({
		"c, c",
		"car, car",
		"rcCar, rcCar",
	})
	public void CarName_생성_성공_테스트(final String name, final String expected) {
		CarName carName = new CarName(name);
		assertThat(carName).isNotNull();
		assertThat(carName.getName()).isEqualTo(expected);

	}

	@Test
	public void CarName_공백_널_입력시_생성_실패_테스트() {
		assertThatThrownBy(() -> {
			new CarName("");
		}).isInstanceOf(InputInvalidException.class)
			.hasMessageContaining(ExceptionMessages.CAR_NAME_INPUT_EMPTY_EXCEPTION_MSG);

		assertThatThrownBy(() -> {
			new CarName(null);
		}).isInstanceOf(InputInvalidException.class)
			.hasMessageContaining(ExceptionMessages.CAR_NAME_INPUT_EMPTY_EXCEPTION_MSG);
	}

	@Test
	public void CarName_다섯자_이상_입력시_생성_실패_테스트() {
		assertThatThrownBy(() -> {
			new CarName("racingCar");
		}).isInstanceOf(InputInvalidException.class)
			.hasMessageContaining(ExceptionMessages.CAR_NAME_INPUT_LENGTH_EXCEPTION_MSG);
	}
}
