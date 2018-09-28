package five;

public class Song {
	private String songName;
	private String singer;
	private double time;
	public Song(String songName, String singer, double time) {
		super();
		this.songName = songName;
		this.singer = singer;
		this.time = time;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
    public String toString(){
        return "开始播放下一首歌曲:"+songName+"\n歌手"+singer+" 时长"+time;
    }
	public static Song SongA = new Song("SongA", "Bob", 3.5);
	public static Song SongB = new Song("SongB", "James", 4.2);
	public static Song SongC = new Song("SongC", "Green", 3.4);
	public static Song SongD = new Song("SongD", "Tom", 4.5);

	
}
