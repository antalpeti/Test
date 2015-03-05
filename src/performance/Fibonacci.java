package performance;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
  private static final String FIBONACCI_RECURSION = "Fibonacci Recursion: ";

  private static final String FIBONACCI_ITERATION = "Fibonacci Iteration: ";

  int steps = 0;

  private static Map<String, Statements> ssMap;
  private static Map<String, Long> timeMap;

  public static void main(String[] args) {
    Fibonacci fib = new Fibonacci();

    fib.createStatements();
    timeMap = new HashMap<String, Long>();

    System.out.println("How many steps needed to calculate in iterative mode?");
    long time = TimeUtil.measureExecutionTime(FIBONACCI_ITERATION, ssMap.get(FIBONACCI_ITERATION));
    timeMap.put(FIBONACCI_ITERATION, time);
    System.out.println();
    System.out.println("\nHow many steps needed to calculate in recursive mode?");
    time = TimeUtil.measureExecutionTime(FIBONACCI_RECURSION, ssMap.get(FIBONACCI_RECURSION));
    timeMap.put(FIBONACCI_RECURSION, time);

    long maxTime = TimeUtil.calculateMaxTime(timeMap.values());
    System.out.println("\nHow many times faster the given method according to the slowest method?");
    TimeUtil.printExecutionTimesComparison(timeMap, maxTime);
  }

  private void createStatements() {
    ssMap = new HashMap<String, Statements>();

    String key = FIBONACCI_ITERATION;
    Statements value = new Statements() {

      @Override
      public void runStatements() {
        for (int i = 0; i < 30; i++) {
          System.out.println(i + ". Fibonacci: " + fiboIter(i) + " steps needed: " + steps);
          steps = 0;
        }
      }
    };
    ssMap.put(key, value);
    key = FIBONACCI_RECURSION;
    value = new Statements() {

      @Override
      public void runStatements() {
        for (int i = 0; i < 30; i++) {
          System.out.println(i + ". Fibonacci: " + fiboRec(i) + " steps needed: " + steps);
          steps = 0;
        }
      }
    };
    ssMap.put(key, value);
  }

  int fiboIter(int n) {
    if (n < 0) {
      System.out.println("Negative value is not allowable!");
    }
    int f1 = 1, f2 = 0, f = 0;
    for (int i = 1; i < n; i++) {
      steps++;
      f = f1 + f2;
      f1 = f2;
      f2 = f;
    }
    return f;
  }

  int fiboRec(int n) {
    ++steps;
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    } else {
      return fiboRec(n - 1) + fiboRec(n - 2);
    }
  }
}
