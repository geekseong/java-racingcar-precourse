package game.car;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.exception.ExceptionMessages;
import game.exception.InputInvalidException;
import game.view.OutputView;

public class RacingCarsTest {

	private RacingCars racingCars;

	@BeforeEach
	public void setup() {
		racingCars = new RacingCars("car1,car2,car3");
	}

	@Test
	public void RacingCars_생성_실패_테스트() {
		assertThatThrownBy(() -> {
			new RacingCars("");
		}).isInstanceOf(InputInvalidException.class)
			.hasMessageContaining(ExceptionMessages.CAR_NAMES_INPUT_COUNT_EXCEPTION_MSG);

		assertThatThrownBy(() -> {
			new RacingCars(null);
		}).isInstanceOf(InputInvalidException.class)
			.hasMessageContaining(ExceptionMessages.CAR_NAMES_INPUT_COUNT_EXCEPTION_MSG);
	}

	@Test
	public void RacingCars_결과_테스트() {
		racingCars.accelerate(Arrays.asList(1, 3, 4));
		String outputView1 = OutputView.inTimeRacing(racingCars.getRacingCarList());
		assertThat(outputView1).isEqualTo("car1: \ncar2: \ncar3: -\n");

		racingCars.accelerate(Arrays.asList(1, 5, 6));
		String outputView2 = OutputView.inTimeRacing(racingCars.getRacingCarList());
		assertThat(outputView2).isEqualTo("car1: \ncar2: -\ncar3: --\n");

		racingCars.accelerate(Arrays.asList(7, 8, 9));
		String outputView3 = OutputView.inTimeRacing(racingCars.getRacingCarList());
		assertThat(outputView3).isEqualTo("car1: -\ncar2: --\ncar3: ---\n");

		String winnerView = OutputView.winners(racingCars.getWinners());
		assertThat(winnerView).isEqualTo("car3가 최종 우승했습니다.");
	}
}
