package five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master {
	//歌曲列表
	static List<Song> listSong;

	//构造函数,初始化listSong
	public Master() {
		listSong = new ArrayList<Song>();
		System.out.println("可选歌曲: 1.SongA 2.SongB 3.SongC 4.SongD");
	}
	
	//播放歌曲
	public boolean play() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请主持人选择:输入0开始播放列表 ,输入歌曲序号播放相应歌曲,输入exit退出系统");
		while(true) {
			String input = scan.next();
			switch(input) {
			case "0":
				for (Song song : listSong) {
					System.out.println(song.toString());				
				}
				System.out.println("列表播放完毕,主持人请继续选择:");
				break;
			case "1":
				System.out.println(Song.SongA.toString());
				break;
			case "2":
				System.out.println(Song.SongB.toString());
				break;
			case "3":
				System.out.println(Song.SongC.toString());
				break;
			case "4":
				System.out.println(Song.SongD.toString());
				break;
			case "exit":
				scan.close();
				return true;
			default:
				System.out.println("请输入上述有效序号");
				break;
			}

		}
	}
}
