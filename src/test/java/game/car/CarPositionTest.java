package game.car;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarPositionTest {

	@Test
	public void CarPosition_위치_테스트() {
		CarPosition carPosition = new CarPosition();
		assertThat(carPosition).isNotNull();
		assertThat(carPosition.getPosition()).isEqualTo(0);

		carPosition.moveForward();
		assertThat(carPosition.getPosition()).isEqualTo(1);
		assertThat(carPosition.getPositionToString()).isEqualTo("-");

		carPosition.moveForward();
		assertThat(carPosition.getPosition()).isEqualTo(2);
		assertThat(carPosition.getPositionToString()).isEqualTo("--");
	}
}
