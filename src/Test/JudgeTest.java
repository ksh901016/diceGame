package Test;

import org.junit.Before;
import org.junit.Test;

import Dice.FraudDice;
import Player.Player;
import etc.Judge;
import etc.Recorder;

public class JudgeTest {
	private Judge judge;
	private FraudDice fDice;
	
	@Before
	public void setup(){
		judge = new Judge(new Recorder());
		fDice = new FraudDice();
	}
	
	@Test
	public void testPlay(){
	}
	
}
