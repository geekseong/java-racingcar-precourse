package game.utils;

public class ValidationUtil {
	public static final int LEN_MIN = 0;
	public static final int LEN_MAX = 5;
	public static final int NUM_RANGE_MIN = 0;
	public static final int NUM_RANGE_MAX = 9;

	public static boolean isNotEmpty(String str) {
		if (str == null) {
			return false;
		}
		return str.trim().length() != 0;
	}

	public static boolean isStrLenLessThan5(String str) {
		if (!isNotEmpty(str)) {
			return false;
		}

		String trimStr = str.trim();
		return trimStr.length() >= LEN_MIN && trimStr.length() <= LEN_MAX;
	}

	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isRangeZeroToNine(int num) {
		return num >= NUM_RANGE_MIN && num <= NUM_RANGE_MAX;
	}
}
