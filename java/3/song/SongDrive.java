package five;

public class SongDrive {
	//������
	public Master master;
	
	//����
	public Player player;
	
	//��ʼ��Master��Player
	public SongDrive() {
		super();
		master = new Master();
		player = new Player();
	}
	
	//��ں���
	public static void main(String[] args) {
		System.out.println("��ʼ����,��ӭʹ��");
		SongDrive sd = new SongDrive();
		if(sd.player.addSong())
			sd.master.play();
	}

}
