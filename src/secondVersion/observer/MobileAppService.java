package secondVersion.observer;

public class MobileAppService implements Observer {
  private String mobileId = "12419fk1-v93n1l3";

  @Override
  public void notify(String message) {
    System.out.println(message + " sent by mobile notification to " + mobileId);
  }
}
