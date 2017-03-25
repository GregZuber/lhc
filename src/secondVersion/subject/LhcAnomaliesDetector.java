package secondVersion.subject;

import secondVersion.observer.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by g on 21.03.17.
 */
public class LhcAnomaliesDetector {
    private List<Observer> observers = new LinkedList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void informAboutAnomaly(String message) {
        observers.forEach(observer -> observer.notify(message));
    }
}
