package Test;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import Dice.FraudDice;
import Player.Player;
import etc.Recorder;

public class RecorderTest {
	private Recorder recorder;
	private FraudDice fDice;
	private ArrayList<Player> players;
	
	@Before
	public void setup(){
		recorder = new Recorder();
		fDice = new FraudDice();
		//winner 메서드 테스트
		players = new ArrayList<Player>();
		players.add(new Player("1",fDice));
		players.add(new Player("2",fDice));
		
		System.out.println("setup ");
	}
	
	@Test
	public void testCheckMode() throws Exception{
		fDice.setMode("strong");
		String mode = recorder.checkMode(fDice);
		Assert.assertEquals("[STRONG]", mode);
	}
	
	@Test
	public void testWinner() throws Exception{
		players.get(0).setSocre(300);
		players.get(1).setSocre(500);
		Player winner = recorder.winner(players);
		Assert.assertEquals(players.get(1), winner);
		
	}
}
