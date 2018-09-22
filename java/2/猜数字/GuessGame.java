package three;

public class GuessGame {
	
	Player player1;
	Player player2;
	Player player3;
	
	public GuessGame(){
		player1 = new Player();
		player2 = new Player();
		player3 = new Player();
	}
	
	public void startGame(){
		while(true) {
			player1.guess(1);
			player2.guess(2);
			player3.guess(3);
		}
	}
}
