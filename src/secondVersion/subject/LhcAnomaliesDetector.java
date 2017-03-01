package secondVersion.subject;

import secondVersion.observer.EmailService;
import secondVersion.observer.MobileAppService;
import secondVersion.observer.Observer;
import secondVersion.observer.SmsService;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAnomaliesDetector implements Subject{
  List<Observer> observers = new LinkedList<>();

  @Override
  public void notifyObservers(String message) {
    for (Observer observer: observers) {
      observer.notify(message);
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }
}
