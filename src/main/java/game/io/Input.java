package game.io;

import java.util.Scanner;

import game.utils.ValidationUtil;

public class Input {
	private final static Scanner INPUT = new Scanner(System.in);
	public static final String REQUIRED_ONLY_NUMBER_MSG = "숫자만 입력이 가능합니다.";

	public static String readString() {
		return INPUT.nextLine();
	}

	public static int readInt() {
		String line = readString();
		while (!ValidationUtil.isNumber(line)) {
			Output.println(REQUIRED_ONLY_NUMBER_MSG);
			line = readString();
		}

		return Integer.parseInt(line);
	}
}
