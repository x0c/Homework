package five;

public class SongDrive {
	//主持人
	public Master master;
	
	//点歌的
	public Player player;
	
	//初始化Master和Player
	public SongDrive() {
		super();
		master = new Master();
		player = new Player();
	}
	
	//入口函数
	public static void main(String[] args) {
		System.out.println("开始运行,欢迎使用");
		SongDrive sd = new SongDrive();
		if(sd.player.addSong())
			sd.master.play();
	}

}
