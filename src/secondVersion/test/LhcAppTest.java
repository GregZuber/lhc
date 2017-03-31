package secondVersion.test;

import secondVersion.observer.EmailService;
import secondVersion.observer.MobileAppService;
import secondVersion.observer.Observer;
import secondVersion.observer.SmsService;
import secondVersion.subject.LhcAnomaliesNotifier;

public class LhcAppTest {

  public static void main(String[] args) {
    Observer emailService = new EmailService();
    Observer smsService = new SmsService();
    Observer mobileAppService = new MobileAppService();

    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();

    lhcAnomaliesNotifier.registerObserver(emailService);
    lhcAnomaliesNotifier.registerObserver(smsService);
    lhcAnomaliesNotifier.registerObserver(mobileAppService);

    lhcAnomaliesNotifier.notifyObservers("too high temperature");

    System.out.println("#########################");

    lhcAnomaliesNotifier.unregisterObserver(smsService);

    lhcAnomaliesNotifier.notifyObservers("magnet 41516-153 is broken!!!!!!! ");
  }
}
