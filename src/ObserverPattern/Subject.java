package ObserverPattern;

import java.util.ArrayList;

/**
 * Created by Safoora Yousefi on 7/31/18.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
