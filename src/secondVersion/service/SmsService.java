package secondVersion.service;

import secondVersion.observer.Observer;

/**
 * Created by zuber on 01.03.17.
 */
public class SmsService implements Observer {
  private String phoneNumber = "654321987";

  @Override
  public void notify(String message) {
    System.out.println(message + " sent by sms to " + phoneNumber);
  }
}
