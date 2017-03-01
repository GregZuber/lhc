package service;

/**
 * Created by zuber on 01.03.17.
 */
public class EmailService {
  private String email = "grzegorz.zuber@cern.ch";

  public void sendEmail(String message) {
    System.out.println(message + " sent by email to " + email);
  }
}
