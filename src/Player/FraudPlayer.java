package Player;

import Dice.Dice;
import Dice.FraudDice;

public class FraudPlayer extends Player {

	private FraudDice fraudDice;
	private Player rival;

	public FraudPlayer(String name, FraudDice fraudDice, Player rival) {
		super(name, fraudDice);
		this.fraudDice = fraudDice;
		this.rival = rival;
	}

	@Override
	public void prepare() {
		if (getScore() < rival.getScore()) {
			fraudDice.setMode("strong");
		} else if (getScore() >= rival.getScore() + 6) {
			fraudDice.setMode("weak");
		} else {
			fraudDice.setMode("normal");
		}
	}

}
