package secondVersion.observer;
/**
 * Created by zuber on 01.03.17.
 */
public class EmailService implements Observer {
  private String email = "grzegorz.zuber@cern.ch";

  @Override
  public void notify(String message) {
    System.out.println(message + " sent by email to " + email);
  }
}
