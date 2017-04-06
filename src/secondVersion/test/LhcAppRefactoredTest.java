package secondVersion.test;

import secondVersion.observer.EmailService;
import secondVersion.observer.MobileAppService;
import secondVersion.observer.Observer;
import secondVersion.observer.SmsService;
import secondVersion.subject.LhcAnomaliesNotifier;

public class LhcAppRefactoredTest {
  private LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
  private Observer emailService = new EmailService();
  private Observer smsService = new SmsService();
  private Observer mobileAppService = new MobileAppService();

  public static void main(String[] args) {
    LhcAppRefactoredTest lhcAppTest = new LhcAppRefactoredTest();
    lhcAppTest.test();
  }

  private void test() {
    registerObservers();
    notifyObservers("too high temperature");
    printHashes();
    unregisterObserver(smsService);
    notifyObservers("magnet 41516-153 is broken!!!!!!! ");
  }

  private void registerObservers() {
    lhcAnomaliesNotifier.registerObserver(emailService);
    lhcAnomaliesNotifier.registerObserver(smsService);
    lhcAnomaliesNotifier.registerObserver(mobileAppService);
  }

  private void notifyObservers(String message) {
    lhcAnomaliesNotifier.notifyObservers(message);
  }

  private void printHashes() {
    System.out.println("#########################");
  }

  private void unregisterObserver(Observer observer) {
    lhcAnomaliesNotifier.unregisterObserver(observer);
  }
}
