package thirdVersion.subject;

import thirdVersion.observer.Observer;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAnomaliesDetector extends Subject {

  private String anomalyMessage;

  @Override
  protected void notifyObserver(Observer observer) {
    observer.notify(anomalyMessage);
  }

  public void setAnomalyMessage(String anomalyMessage) {
    this.anomalyMessage = anomalyMessage;
  }
}
