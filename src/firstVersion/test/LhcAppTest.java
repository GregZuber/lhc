package firstVersion.test;

import firstVersion.notifier.LhcAnomaliesNotifier;

public class LhcAppTest {
  public static void main(String[] args) {
    LhcAnomaliesNotifier lhcAnomaliesNotifier = new LhcAnomaliesNotifier();
    lhcAnomaliesNotifier.informAboutAnomaly("too high temperature");
  }
}
