package secondVersion.observer;

public class SmsService implements Observer {
  private String phoneNumber = "654321987";

  @Override
  public void notify(String message) {
    System.out.println(message + " sent by sms to " + phoneNumber);
  }
}
