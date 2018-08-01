package ObserverPattern;

/**
 * Created by Safoora Yousefi on 7/31/18.
 */
public class Main {
    public static void main(String args[]) {
        Channel c = new Channel("Kitten Lady");
        Follower f1 = new Follower("Safoora");
        Follower f2 = new Follower("Layla");
        c.registerObserver(f1);
        c.registerObserver(f2);
        c.notifyObservers();
    }
}
