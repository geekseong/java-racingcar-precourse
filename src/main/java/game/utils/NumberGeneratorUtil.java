package game.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberGeneratorUtil {
	private final static List<Integer> NUM_SET = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
	public final static List<Integer> generateNumList(int count) {
		Collections.shuffle(NUM_SET);
		return NUM_SET.subList(0, count);
	}
}
