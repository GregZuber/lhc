package secondVersion.detector;

import secondVersion.service.EmailService;
import secondVersion.service.MobileAppService;
import secondVersion.service.SmsService;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAnomaliesDetector {
  private SmsService smsService = new SmsService();
  private EmailService emailService = new EmailService();
  private MobileAppService mobileAppService = new MobileAppService();

  public void informAboutAnomaly(String message) {
    smsService.sendSms(message);
    emailService.sendEmail(message);
    mobileAppService.sendNotification(message);
  }

}
