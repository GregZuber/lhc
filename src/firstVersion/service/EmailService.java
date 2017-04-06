package firstVersion.service;

public class EmailService {
  private String email = "grzegorz.zuber@cern.ch";

  public void sendEmail(String message) {
    System.out.println(message + " sent by an email to " + email);
  }
}
