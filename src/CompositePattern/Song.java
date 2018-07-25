package CompositePattern;

/**
 * Created by Safoora Yousefi on 7/24/18.
 */
public class Song implements IComponent {
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist ) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getName()
    {
        return this.songName;
    }
    public String getArtist()
    {
        return this.artist;
    }
    public void play()
    {
        System.out.println("Song Playing!");
    }
    public void setPlaybackSpeed(float playbackSpeed)
    {
        this.speed = playbackSpeed;
    }
}
