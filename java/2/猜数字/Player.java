package three;

import java.util.Scanner;

public class Player {
	
	protected int number;
	protected int score = 0;
	Scanner scanner = new Scanner(System.in);
	
	public void guess(int n) {
		this.number=(int)(Math.random()*10);
		System.out.println("���"+n+"������");
		int i = scanner.nextInt();
		if (i == this.number)
			System.out.println("���"+n+"��Ӯ��,����"+this.number);
		else {
			this.score++;
			System.out.println("���"+n+"������,����"+this.number+",������"+score+"Ԫ");
		}
	}
}
