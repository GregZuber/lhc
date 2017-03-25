package firstVersion.test;

import firstVersion.notifier.LhcAnomaliesNotifier;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAppTest {
  public static void main(String[] args) {
    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
    lhcAnomaliesNotifier.informAboutAnomaly("too high temperature");
  }
}
