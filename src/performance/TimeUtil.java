package performance;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;


public class TimeUtil {
  private static void runStatements(Statements ss) {
    ss.runStatements();
  }

  public static long mesureExecutionTime(String header, Statements ss) {
    System.out.println(header);
    long start = System.nanoTime();
    runStatements(ss);
    long time = System.nanoTime() - start;
    System.out.println(time + "ns");
    return time;
  }

  public static long calculateMaxTime(Collection<Long> times) {
    long maxTime = 0;
    for (long value : times) {
      maxTime = value > maxTime ? value : maxTime;
    }

    return maxTime;
  }

  public static void printExecutionTimes(Map<String, Long> timeMap, long maxTime) {
    for (Entry<String, Long> entry : timeMap.entrySet()) {
      System.out.println(entry.getKey() + maxTime / entry.getValue());
    }
  }
}
