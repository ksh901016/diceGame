package Player;

import Dice.Dice;

public class Player {

	private int score = 0;
	private String name = "";
	Dice dice;

	// 생성자
	public Player(String name, Dice dice) {
		this.name = name;
		this.dice = dice;

	}
	
	public void play(){
		score += dice.cast();
	}

	public String toString() {
		return this.name + "\t" + this.score;
	}
	
	public void prepare(){
		
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public Dice getDice() {
		return dice;
	}

}
