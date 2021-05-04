package game.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

	private RacingCar racingCar;

	@BeforeEach
	public void setup() {
		racingCar = new RacingCar("car");
	}

	@Test
	public void 자동차_전진_검사() {
		racingCar.pushAcceleration(4);
		racingCar.pushAcceleration(0);
		racingCar.pushAcceleration(9);
		racingCar.pushAcceleration(3);

		assertThat(racingCar.getResult()).isEqualTo("car: --");
	}

}
