package Test;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Dice.Dice;
import Dice.FraudDice;
import etc.Recorder;

public class DiceTest {
	private Dice dice;
	private FraudDice Fdice;
	@Before
	public void setup(){
		dice = new Dice();
		System.out.println("setup ");
	}
	@Before
	public void Fraudsetup(){
		Fdice = new FraudDice();
		System.out.println("FraudDice setup");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDice() throws Exception{
		int result = dice.cast();
		Assert.assertTrue(result<=6 &&result>=1);
	}
	
	@Test
	public void testFraudDice() throws Exception{
		Fdice.setMode("strong");
		for(int i =0; i<=1000; i++){
			int result = Fdice.cast();
			Assert.assertTrue(result >=2);
		}
		//1000번씩 테스트
		Fdice.setMode("weak");
		for(int i=0; i<=100; i++){
			int result = Fdice.cast();
			Assert.assertTrue(result<=5);
		}
	}
	
	
}
