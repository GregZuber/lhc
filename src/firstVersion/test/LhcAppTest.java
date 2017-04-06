package firstVersion.test;

import firstVersion.notifier.LhcAnomaliesNotifier;
import firstVersion.service.EmailService;
import firstVersion.service.MobileAppService;
import firstVersion.service.SmsService;

import java.util.LinkedList;
import java.util.List;

public class LhcAppTest {
  public static void main(String[] args) {
    List<Object> servicesToInform = prepareServicesToInform();
    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
    lhcAnomaliesNotifier.informAboutAnomaly(servicesToInform, "too high temperature");
  }

  private static List<Object> prepareServicesToInform() {
    List<Object> services = new LinkedList<>();

    services.add(new SmsService());
    services.add(new EmailService());
    services.add(new MobileAppService());

    return services;
  }
}
