package firstVersion.service;

public class MobileAppService {
  private String mobileId = "12419fk1-v93n1l3";

  public void sendNotification(String message) {
    System.out.println(message + " sent by a mobile notification to " + mobileId);
  }
}
