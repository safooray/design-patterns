package CompositePattern;
/**
 * Created by Safoora Yousefi on 7/24/18.
 */
public interface IComponent {
    String getName();
    void play();
    void setPlaybackSpeed(float playbackSpeed);
}