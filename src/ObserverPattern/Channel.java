package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by Safoora Yousefi on 7/31/18.
 */
public class Channel implements Subject {
    ArrayList<Observer> followers;
    String status;
    String channelName;
    Channel(String name)
    {
        this.followers = new ArrayList<Observer>();
        this.channelName = name;
    }
    public String getStatus()
    {
        return this.status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.followers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.followers.forEach(follower->follower.update(this.status));
    }
}