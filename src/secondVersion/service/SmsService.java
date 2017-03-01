package secondVersion.service;

/**
 * Created by zuber on 01.03.17.
 */
public class SmsService {
  private String phoneNumber = "654321987";

  public void sendSms(String message) {
    System.out.println(message + " sent by sms to " + phoneNumber);
  }
}
