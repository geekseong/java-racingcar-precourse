package game.car;

public class CarPosition {
	private final String RACING_POSITION_CHARACTER = "-";
	private int position;

	public CarPosition() {
		this.position = 0;
	}

	public CarPosition(int position) {
		this.position = position;
	}

	public void moveForward() {
		position++;
	}

	public String getPositionToString() {
		StringBuilder positionResult = new StringBuilder();
		for (int i = 0; i < position; ++i) {
			positionResult.append(RACING_POSITION_CHARACTER);
		}
		return positionResult.toString();
	}

	public int getPosition() {
		return position;
	}

}
