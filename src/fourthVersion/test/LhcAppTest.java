package fourthVersion.test;

import fourthVersion.observer.EmailService;
import fourthVersion.observer.MobileAppService;
import fourthVersion.observer.Observer;
import fourthVersion.observer.SmsService;
import fourthVersion.subject.LhcAnomaliesDetector;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAppTest {
  LhcAnomaliesDetector lhcAnomaliesDetector = new LhcAnomaliesDetector();
  List<Observer> observers = new LinkedList<>();

  public static void main(String[] args) {
    LhcAppTest lhcAppTest = new LhcAppTest();
    lhcAppTest.createServices();
    lhcAppTest.registerObservers();
    lhcAppTest.notifyObservers("too high temperature");
    lhcAppTest.removeObserver(0);
    lhcAppTest.notifyObservers("one magnet is broken");
  }

  private void createServices() {
    observers.add(new EmailService());
    observers.add(new SmsService());
    observers.add(new MobileAppService());
  }

  private void registerObservers() {
    for (Observer observer : observers) {
      lhcAnomaliesDetector.registerObserver(observer);
    }
  }

  private void notifyObservers(String anomalyMessage) {
    lhcAnomaliesDetector.setAnomalyMessage(anomalyMessage);
    lhcAnomaliesDetector.notifyObservers();
  }

  private void removeObserver(int observerId) {
    lhcAnomaliesDetector.removeObserver(observers.get(observerId));
  }
}
