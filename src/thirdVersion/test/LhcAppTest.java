package thirdVersion.test;

import thirdVersion.observer.EmailService;
import thirdVersion.observer.MobileAppService;
import thirdVersion.observer.Observer;
import thirdVersion.observer.SmsService;
import thirdVersion.subject.LhcAnomaliesDetector;
import thirdVersion.subject.Subject;

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
    lhcAppTest.notifyObservers("too high temperature");
    lhcAppTest.removeObserver(0);
    lhcAppTest.notifyObservers("one magnet is broken");
  }

  private void createServices() {
    observers.add(new EmailService(lhcAnomaliesDetector));
    observers.add(new SmsService(lhcAnomaliesDetector));
    observers.add(new MobileAppService(lhcAnomaliesDetector));
  }

  private void notifyObservers(String anomalyMessage) {
    lhcAnomaliesDetector.setAnomalyMessage(anomalyMessage);
    lhcAnomaliesDetector.notifyObservers();
  }

  private void removeObserver(int observerId) {
    lhcAnomaliesDetector.removeObserver(observers.get(observerId));
  }
}
