package game.view;

import java.util.Scanner;

import game.utils.ValidationUtil;

public class InputView {
	private final static Scanner INPUT = new Scanner(System.in);
	private static final String CAR_NAME_INPUT_TEXT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RACING_TIME_INPUT_TEXT = "시도할 회수는 몇회인가요?";

	public static String carNameInputRequest() {
		Output.println(CAR_NAME_INPUT_TEXT);
		return InputView.readString();
	}

	public static int racingTimeInputRequest() {
		Output.println(RACING_TIME_INPUT_TEXT);
		return InputView.readInt();
	}

	public static String readString() {
		return INPUT.nextLine();
	}

	public static int readInt() {
		String line = readString();
		while (!ValidationUtil.isNumber(line)) {
			System.out.println("숫자만 입력이 가능합니다.");
			line = readString();
		}

		return Integer.parseInt(line);
	}
}
