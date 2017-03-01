package firstVersion.test;

import firstVersion.detector.LhcAnomaliesDetector;

/**
 * Created by zuber on 01.03.17.
 */
public class LhcAppTest {
  public static void main(String[] args) {
    LhcAnomaliesDetector lhcAnomaliesDetector = new LhcAnomaliesDetector();
    lhcAnomaliesDetector.informAboutAnomaly("too high temperature");
  }
}
