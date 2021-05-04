package game.view;

import java.util.Scanner;

import game.utils.ValidationUtil;

public class InputView {
	private final static Scanner INPUT = new Scanner(System.in);
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
