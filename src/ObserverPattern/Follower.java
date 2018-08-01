package ObserverPattern;

/**
 * Created by Safoora Yousefi on 7/31/18.
 */
public class Follower implements Observer {
    String followerName;
    Follower(String name)
    {
        this.followerName = name;
    }
    @Override
    public void update(String status) {
        System.out.println(this.followerName + " received new blog post: " + status);
    }

    public void play()
    {
        System.out.println("Playing!");
    }
}