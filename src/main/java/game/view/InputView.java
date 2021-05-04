package game.view;

import game.io.Input;
import game.io.Output;

public class InputView {
	private static final String CAR_NAME_INPUT_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RACING_TIME_INPUT_TEXT = "시도할 회수는 몇회인가요?";

	public static String carNameInputRequest() {
		Output.println(CAR_NAME_INPUT_TEXT);
		return Input.readString();
	}

	public static int racingTimeInputRequest() {
		Output.println(RACING_TIME_INPUT_TEXT);
		return Input.readInt();
	}
}
