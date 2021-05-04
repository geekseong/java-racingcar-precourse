package game.car;

public class RacingCar implements Comparable<RacingCar> {
	private static final int THRESHOLD_MIN = 4;
	private static final int THRESHOLD_MAX = 9;

	private CarName name;
	private CarPosition position;

	public RacingCar(String name) {
		this.name = new CarName(name);
		this.position = new CarPosition();
	}

	public void pushAcceleration(int degree) {
		if (isThresholdExceeded(degree)) {
			moveForward();
		}
	}

	public int getPosition() {
		return this.position.getPosition();
	}

	public String getPositionToString() {
		return this.position.getPositionToString();
	}

	public String getName() {
		return this.name.getName();
	}

	private boolean isThresholdExceeded(int degree) {
		return degree >= THRESHOLD_MIN && degree <= THRESHOLD_MAX;
	}

	private void moveForward() {
		position.moveForward();
	}

	@Override
	public int compareTo(RacingCar o) {
		if (this.position.getPosition() < o.position.getPosition()) {
			return 1;
		}

		if (this.position.getPosition() > o.position.getPosition()) {
			return -1;
		}

		return 0;
	}
}
