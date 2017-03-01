package detector;

import service.EmailService;
import service.MobileAppService;
import service.SmsService;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAnomaliesDetector {
  private SmsService smsService;
  private EmailService emailService;
  private MobileAppService mobileAppService;

  public void informAboutAnomaly(String message) {
    smsService.sendSms(message);
  }

}
