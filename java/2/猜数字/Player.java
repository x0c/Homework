package three;

import java.util.Scanner;

public class Player {
	
	protected int number;
	protected int score = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void guess(int n) {
		this.number=(int)(Math.random()*10);
		System.out.println("玩家"+n+"请输入");
		int i = scanner.nextInt();
		if (i == this.number)
			System.out.println("玩家"+n+"您赢了,答案是"+this.number);
		else {
			this.score++;
			System.out.println("玩家"+n+"您错了,答案是"+this.number+",您输了"+score+"元");
		}
	}
}
