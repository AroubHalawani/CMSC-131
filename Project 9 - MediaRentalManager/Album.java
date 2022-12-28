package mediaRentalManager;

public class Album extends Movies{

	
	private String albumArtist;
	private String albumSong;

	/**
	 * Constructor:
	 * 
	 * @param albumTitle Album Title
	 * @param albumArtist Album Artist
	 * @param AlbumSongs Album Songs
	 * @param albumCopies Album Copies
	 */
	public Album (String albumTitle, String albumArtist, String AlbumSongs, int albumCopies) 
	
	{
		super (albumTitle, albumCopies);
		this.albumArtist = albumArtist;
		this.albumSong = AlbumSongs;
	}
	/**
	 * 
	 * @param albumArtist
	 */
	public void setAlbumArtist(String albumArtist)
	{
		this.albumArtist=albumArtist;
	}
	/**
	 * 
	 * @param albumSong
	 */
	public void setAlbumSong(String albumSong)
	{
		this.albumSong=albumSong;
	}
	/**
	 * 
	 * @return Album Artist
	 */
	public String getAlbumArtist()
	{
		return albumArtist;
	}
	/**
	 * 
	 * @return Album Songs
	 */
	public String getAlbumSongs()
	{
		return albumSong;
	}

	public String toString()
	{
		String answer="";
		
		answer= super.toString() + ", Artist: " + getAlbumArtist();
		
		answer+=", Songs: " + getAlbumSongs() + "\n";
		
		return answer;
	}

}