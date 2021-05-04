package game.utils;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberGeneratorUtilTest {

	@Test
	public void NumberGeneratorUtil_숫자_생성_테스트() {
		List<Integer> generatedNumber = NumberGeneratorUtil.generateNumList(4);
		assertThat(generatedNumber).isNotEmpty();
		assertThat(generatedNumber.size()).isEqualTo(4);

		for (int num : generatedNumber) {
			boolean rangeCheckResult = ValidationUtil.isRangeZeroToNine(num);
			assertThat(rangeCheckResult).isTrue();
		}
	}
}
