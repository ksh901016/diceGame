package Test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Dice.Dice;
import Dice.FraudDice;
import etc.Recorder;

public class DiceTest {
	private Dice dice;
	private Recorder recorder;
	private FraudDice fDice;
	@Before
	public void setup(){
		dice = new Dice();
		recorder = new Recorder();
		fDice = new FraudDice();
		System.out.println("setup ");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDice() throws Exception{
		int result = dice.cast();
		Assert.assertTrue(result<=6 &&result>=1);
	}
	
	
	@Test
	public void testCheckMode() throws Exception{
		fDice.setMode("strong");
		String mode = recorder.checkMode(fDice);
		Assert.assertEquals("[STRONG]", mode);
		
	}
}
