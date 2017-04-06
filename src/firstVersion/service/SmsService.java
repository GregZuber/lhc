package firstVersion.service;

public class SmsService {
  private String phoneNumber = "654321987";

  public void sendSms(String message) {
    System.out.println(message + " sent by an sms to " + phoneNumber);
  }
}
