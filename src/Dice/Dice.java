package Dice;

import java.util.Random;

public class Dice {
	
	private Random random = new Random();

	public int cast(){
		return random.nextInt(6)+1;
	}
}
