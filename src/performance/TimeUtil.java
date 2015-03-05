package performance;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;


public class TimeUtil {
  private static void runStatements(Statements ss) {
    ss.runStatements();
  }

  /**
   * Measure the execution time of the statement and print out the result.
   *
   * @param header
   * @param ss
   * @return
   */
  public static long measureExecutionTime(String header, Statements ss) {
    System.out.println(header);
    long start = System.nanoTime();
    runStatements(ss);
    long time = System.nanoTime() - start;
    System.out.println("Execution time: " + time + "ns");
    return time;
  }

  /**
   * Calculate the biggest so the slowest execution time.
   *
   * @param times
   * @return
   */
  public static long calculateMaxTime(Collection<Long> times) {
    long maxTime = 0;
    for (long value : times) {
      maxTime = value > maxTime ? value : maxTime;
    }

    return maxTime;
  }

  /**
   * Take the biggest execution time and every execution time divide by it.
   *
   * @param timeMap
   * @param maxTime
   */
  public static void printExecutionTimesComparison(Map<String, Long> timeMap, long maxTime) {
    for (Entry<String, Long> entry : timeMap.entrySet()) {
      System.out.println(entry.getKey() + maxTime / entry.getValue() + " times faster");
    }
  }
}
