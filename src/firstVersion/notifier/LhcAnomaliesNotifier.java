package firstVersion.notifier;

import firstVersion.service.EmailService;
import firstVersion.service.MobileAppService;
import firstVersion.service.SmsService;

import java.util.List;

public class LhcAnomaliesNotifier {

  public void informAboutAnomaly(List<Object> servicesToInform, String message) {

    servicesToInform.forEach(service -> {

      if (service instanceof EmailService) {
        EmailService emailService = ((EmailService) service);
        emailService.sendEmail(message);
      }

      else if (service instanceof MobileAppService) {
        MobileAppService mobileAppService = ((MobileAppService) service);
        mobileAppService.sendNotification(message);
      }

      else if (service instanceof SmsService) {
        SmsService smsService = ((SmsService) service);
        smsService.sendSms(message);
      }

    });

  }

}
