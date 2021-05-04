package game.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.view.OutputView;

public class RacingCarTest {

	private RacingCar racingCar;

	@BeforeEach
	public void setup() {
		racingCar = new RacingCar("car");
	}

	@Test
	public void RacingCar_전진_테스트() {
		racingCar.pushAcceleration(4);
		racingCar.pushAcceleration(0);
		racingCar.pushAcceleration(9);
		racingCar.pushAcceleration(3);

		assertThat(OutputView.racingCarCurrentPosition(racingCar)).isEqualTo("car: --");
	}

}
