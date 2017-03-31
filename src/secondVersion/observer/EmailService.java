package secondVersion.observer;

public class EmailService implements Observer {
  private String email = "grzegorz.zuber@cern.ch";

  @Override
  public void notify(String message) {
    System.out.println(message + " sent by email to " + email);
  }
}
