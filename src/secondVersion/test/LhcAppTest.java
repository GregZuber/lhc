package secondVersion.test;

import secondVersion.service.EmailService;
import secondVersion.service.MobileAppService;
import secondVersion.service.SmsService;
import secondVersion.subject.LhcAnomaliesDetector;

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
    LhcAnomaliesDetector lhcAnomaliesDetector = new LhcAnomaliesDetector();

    lhcAnomaliesDetector.registerObserver(emailService);
    lhcAnomaliesDetector.registerObserver(smsService);
    lhcAnomaliesDetector.registerObserver(mobileAppService);

    lhcAnomaliesDetector.informAboutAnomaly("too high temperature");

    System.out.println("#########################");

    lhcAnomaliesDetector.unregisterObserver(smsService);

    lhcAnomaliesDetector.informAboutAnomaly("magnet 41516-153 is broken!!!!!!! ");


  }
}
