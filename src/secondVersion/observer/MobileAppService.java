package secondVersion.observer;

import secondVersion.subject.Subject;

/**
 * Created by zuber on 01.03.17.
 */
public class MobileAppService implements Observer{
  private String mobileId = "12419fk1-v93n1l3";
  private Subject subject;

  public MobileAppService(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void notify(String message) {
    sendNotification(message);
  }

  private void sendNotification(String message) {
    System.out.println(message + " sent by mobile notification to " + mobileId);
  }
}
