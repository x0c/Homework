package five;

import java.util.Scanner;

public class Player {
	public boolean addSong() {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѡ��:������������ŵ��,����\"ok\"��������������");
		
		while(true) {
			String input = scan.next();
			switch(input) {
			case "1":
				Master.listSong.add(Song.SongA);
				break;
			case "2":
				Master.listSong.add(Song.SongB);
				break;
			case "3":
				Master.listSong.add(Song.SongC);
				break;
			case "4":
				Master.listSong.add(Song.SongD);
				break;
			case "ok":
				return true;
			default:
				System.out.println("������������Ч���");
				break;
			}
		}
	}
}
