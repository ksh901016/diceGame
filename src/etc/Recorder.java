package etc;

import java.awt.List;
import java.util.ArrayList;

import Dice.Dice;
import Dice.FraudDice;
import Player.FraudPlayer;
import Player.Player;

public class Recorder {

	public void printScore(ArrayList<Player> players) {
		for (Player player : players) {
			System.out.print(player);
			System.out.print(checkMode(player.getDice()));

		}
		System.out.println();
	}

	public String checkMode(Dice dice) {
		if (dice instanceof FraudDice) {
			FraudDice fraudDice = (FraudDice) dice;
			switch (fraudDice.getMode()) {
			case "strong":
				return "[STRONG]";
			case "weak":
				return "[WEAK]";
			default:
				return "[NORMAL]";
			}
		} else
			return "";

	}
	
	public Player winner(ArrayList<Player> players){
		Player winner = null;
		int best =0;
		for(Player player : players){
			if(player.getScore()>best){
				best = player.getScore();
				winner = player;
			}else if(player.getScore()==best){
				return winner = null;
			}
		}
		return winner;
	}
	
}
