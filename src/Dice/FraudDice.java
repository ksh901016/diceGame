package Dice;

public class FraudDice extends Dice {

	private String mode = "normal";

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public int cast() {
		while (true) {
			int score = super.cast();
			if (mode == "strong" && score < 2)
				continue;
			if (mode == "weak" && score > 5)
				continue;
			return score;

		}
	}

}
