package secondVersion.subject;

import secondVersion.observer.Observer;

/**
 * Created by zuber on 01.03.17.
 */
public interface Subject {
  public void notifyObservers(String message);
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
}
