package five;

import java.util.Scanner;

public class Player {
	public boolean addSong() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请点歌者选择:依次输入歌曲号点歌,输入\"ok\"交由主持人主持");
		
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
				System.out.println("请输入上述有效序号");
				break;
			}
		}
	}
}
