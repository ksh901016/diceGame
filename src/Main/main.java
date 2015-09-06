package Main;

import Dice.Dice;
import Dice.FraudDice;
import Player.FraudPlayer;
import Player.Player;
import etc.Judge;
import etc.Recorder;

public class main {
	public static void main(String[] args){
		Dice dice = new Dice();
		
		Judge judge = new Judge(new Recorder());
		
		Player player2= new Player("강성현",dice);
		FraudPlayer player1 = new FraudPlayer("사기주사위꾼",new FraudDice(),player2);
		
		judge.register(player1);
		judge.register(player2);
		judge.play(5);
	}

}
