package thirdVersion.observer;

import thirdVersion.subject.Subject;

/**
 * Created by zuber on 01.03.17.
 */
public class EmailService implements Observer {
  private String email = "grzegorz.zuber@cern.ch";
  private Subject subject;

  public EmailService(Subject subject) {
    this.subject = subject;
    subject.registerObserver(this);
  }

  @Override
  public void notify(String message) {
    sendEmail(message);
  }

  private void sendEmail(String message) {
    System.out.println(message + " sent by email to " + email);
  }
}
