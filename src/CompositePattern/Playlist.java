/**
 * Created by Safoora Yousefi on 7/24/18.
 */
package CompositePattern;
import java.util.ArrayList;

public class Playlist implements IComponent {

    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList();
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }
    public void add(IComponent component)
    {
        playlist.add(component);
    }
    public void remove(IComponent component)
    {
        playlist.remove(component);
    }
    public String getName()
    {
        return this.playlistName;
    }

    public void play()
    {
        playlist.forEach(IComponent::play);
    }
    public void setPlaybackSpeed(float playbackSpeed)
    {
        playlist.forEach(song -> song.setPlaybackSpeed(playbackSpeed));
    }

}