package secondVersion.test;

import secondVersion.observer.EmailService;
import secondVersion.observer.MobileAppService;
import secondVersion.observer.Observer;
import secondVersion.observer.SmsService;
import secondVersion.subject.LhcAnomaliesDetector;
import secondVersion.subject.Subject;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAppTest {
  public static void main(String[] args) {
    Subject lhcAnomaliesDetector = new LhcAnomaliesDetector();

    Observer emailService = new EmailService(lhcAnomaliesDetector);
    Observer smsService = new SmsService(lhcAnomaliesDetector);
    MobileAppService mobileAppService = new MobileAppService(lhcAnomaliesDetector);

    lhcAnomaliesDetector.notifyObservers("too high temperature");
  }
}
