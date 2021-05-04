package game.validation;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidationUtilTest {

	@Test
	public void 빈문자열_유효성_검사() {
		boolean notEmptyCase = ValidationUtil.isNotEmpty("racingCar");
		assertThat(notEmptyCase).isTrue();

		boolean emptyCase = ValidationUtil.isNotEmpty("");
		assertThat(emptyCase).isFalse();

		boolean nullCase = ValidationUtil.isNotEmpty(null);
		assertThat(nullCase).isFalse();
	}

	@Test
	public void 자동차이름_5자_이하_유효성_검사() {
		boolean moreThan5Case = ValidationUtil.isStrLenLessThan5("racing car game");
		assertThat(moreThan5Case).isFalse();

		boolean lessThen5Case = ValidationUtil.isStrLenLessThan5("game");
		assertThat(lessThen5Case).isTrue();

		boolean nullCase = ValidationUtil.isStrLenLessThan5(null);
		assertThat(nullCase).isFalse();

		boolean emptyCase = ValidationUtil.isStrLenLessThan5("");
		assertThat(emptyCase).isFalse();

		boolean spaceCase = ValidationUtil.isStrLenLessThan5(" ");
		assertThat(spaceCase).isFalse();
	}

	@Test
	public void 숫자입력_검사() {
		boolean strCase = ValidationUtil.isNumber("racing");
		assertThat(strCase).isFalse();

		boolean emptyCase = ValidationUtil.isNumber("");
		assertThat(emptyCase).isFalse();

		boolean spaceCase = ValidationUtil.isNumber(" ");
		assertThat(spaceCase).isFalse();

		boolean nullCase = ValidationUtil.isNumber(null);
		assertThat(nullCase).isFalse();

		boolean passCase = ValidationUtil.isNumber("12345");
		assertThat(passCase).isTrue();
	}

	@Test
	public void 숫자범위_0_9_유효성_검사() {
		boolean zeroCase = ValidationUtil.isRangeZeroToNine(0);
		assertThat(zeroCase).isTrue();

		boolean nineCase = ValidationUtil.isRangeZeroToNine(9);
		assertThat(nineCase).isTrue();

		boolean rangeOutCase1 = ValidationUtil.isRangeZeroToNine(10);
		assertThat(rangeOutCase1).isFalse();

		boolean rangeOutCase2 = ValidationUtil.isRangeZeroToNine(-1);
		assertThat(rangeOutCase2).isFalse();
	}
}
