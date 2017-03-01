package service;

/**
 * Created by zuber on 01.03.17.
 */
public class MobileAppService {
  private String mobileId = "12419fk1-v93n1l3";

  public void sendNotification(String message) {
    System.out.println(message + " sent by mobile notification to " + mobileId);
  }
}
