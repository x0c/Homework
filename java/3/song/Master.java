package five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Master {
	//�����б�
	static List<Song> listSong;

	//���캯��,��ʼ��listSong
	public Master() {
		listSong = new ArrayList<Song>();
		System.out.println("��ѡ����: 1.SongA 2.SongB 3.SongC 4.SongD");
	}
	
	//���Ÿ���
	public boolean play() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������ѡ��:����0��ʼ�����б� ,���������Ų�����Ӧ����,����exit�˳�ϵͳ");
		while(true) {
			String input = scan.next();
			switch(input) {
			case "0":
				for (Song song : listSong) {
					System.out.println(song.toString());				
				}
				System.out.println("�б������,�����������ѡ��:");
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
				System.out.println("������������Ч���");
				break;
			}

		}
	}
}
