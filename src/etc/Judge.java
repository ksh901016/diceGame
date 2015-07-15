package etc;

import java.util.ArrayList;

import Player.Player;

public class Judge {

	ArrayList<Player> players = new ArrayList<Player>();
	Recorder recorder;

	public Judge(Recorder recorder) {
		this.recorder = recorder;
	}

	public void register(Player player) {
		players.add(player);
	}

	public void play(int round) {
		for (int i = 0; i < round; i++) {
			for (Player player : players) {
				player.prepare();
				player.play();
			}
			recorder.printScore(players);

		}
		if(recorder.winner(players)!=null){
			System.out.println(recorder.winner(players).getName()+"가 승리했습니다!!");
		}else{
			System.out.println("비겼습니다!!");
		}

	}

}
