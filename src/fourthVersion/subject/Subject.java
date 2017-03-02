package fourthVersion.subject;

import fourthVersion.observer.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zuber on 01.03.17.
 */
public abstract class Subject {
  List<Observer> observers = new LinkedList<>();

  public void notifyObservers() {
    for (Observer observer: observers) {
      notifyObserver(observer);
    }
  }

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  protected abstract void notifyObserver(Observer observer);
}
