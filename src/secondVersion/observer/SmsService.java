package secondVersion.observer;

import secondVersion.subject.Subject;

/**
 * Created by zuber on 01.03.17.
 */
public class SmsService implements Observer{
  private String phoneNumber = "654321987";
  private Subject subject;

  public SmsService(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void notify(String message) {
    sendSms(message);
  }

  private void sendSms(String message) {
    System.out.println(message + " sent by sms to " + phoneNumber);
  }

}
