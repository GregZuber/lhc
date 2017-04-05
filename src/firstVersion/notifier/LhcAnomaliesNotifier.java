package firstVersion.notifier;

import firstVersion.service.EmailService;
import firstVersion.service.MobileAppService;
import firstVersion.service.SmsService;

import java.util.List;

public class LhcAnomaliesNotifier {

  public void informAboutAnomaly(List<Object> servicesToInform, String message) {

    servicesToInform.forEach(service -> {

      if (service instanceof EmailService) {
        ((EmailService) service).sendEmail(message);
      }

      else if (service instanceof MobileAppService) {
        ((MobileAppService) service).sendNotification(message);
      }

      else if (service instanceof SmsService) {
        ((SmsService) service).sendSms(message);
      }

    });

  }

}
