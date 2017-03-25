package secondVersion.test;

import secondVersion.observer.EmailService;
import secondVersion.observer.MobileAppService;
import secondVersion.observer.SmsService;
import secondVersion.subject.LhcAnomaliesNotifier;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAppTest {
  private EmailService emailService = new EmailService();
  private SmsService smsService = new SmsService();
  private MobileAppService mobileAppService = new MobileAppService();

  public static void main(String[] args) {
    LhcAppTest lhcAppTest = new LhcAppTest();
    lhcAppTest.test();
  }

  private void test() {
    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
    registerObservers(lhcAnomaliesNotifier);

    lhcAnomaliesNotifier.notifyObservers("too high temperature");

    System.out.println("#########################");

    lhcAnomaliesNotifier.unregisterObserver(smsService);
    lhcAnomaliesNotifier.notifyObservers("magnet 41516-153 is broken!!!!!!! ");


  }

  private void registerObservers(LhcAnomaliesNotifier lhcAnomaliesNotifier) {
    lhcAnomaliesNotifier.registerObserver(emailService);
    lhcAnomaliesNotifier.registerObserver(smsService);
    lhcAnomaliesNotifier.registerObserver(mobileAppService);
  }
}
