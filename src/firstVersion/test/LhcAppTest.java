package firstVersion.test;

import firstVersion.notifier.LhcAnomaliesNotifier;
import firstVersion.service.EmailService;
import firstVersion.service.MobileAppService;
import firstVersion.service.SmsService;

import java.util.LinkedList;
import java.util.List;

public class LhcAppTest {
  public static void main(String[] args) {
    List<Object> services = prepareServices();

    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
    lhcAnomaliesNotifier.informAboutAnomaly(services, "too high temperature");
  }

  private static List<Object> prepareServices() {
    SmsService smsService = new SmsService();
    EmailService emailService = new EmailService();
    MobileAppService mobileAppService = new MobileAppService();

    List<Object> services = new LinkedList<>();
    services.add(smsService);
    services.add(emailService);
    services.add(mobileAppService);

    return services;
  }
}
