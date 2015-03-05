package performance;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;


public class StringConcatenation {

  private static final String CONCATENATION = "\nConcatenation:";
  private static final String EXCLAMATORY = "!";
  private static final String TEST = "Test ";
  private static final String HELLO = "Hello";
  private static final String STRING_BUILDER = "\nStringBuilder:";
  private static final String STRING_BUFFER = "\nStringBuffer:";
  private static final String MESSAGEFORMAT = "\nMessageFormat:";
  private static final String NS = " ns";

  private static Map<String, Statements> ssMap;
  private static Map<String, Long> timeMap;

  public static void main(String[] args) {

    createStatements();
    timeMap = new HashMap<String, Long>();

    long time = TimeUtil.measureExecutionTime(MESSAGEFORMAT, ssMap.get(MESSAGEFORMAT));
    timeMap.put(MESSAGEFORMAT, time);

    time = TimeUtil.measureExecutionTime(STRING_BUFFER, ssMap.get(STRING_BUFFER));
    timeMap.put(STRING_BUFFER, time);

    time = TimeUtil.measureExecutionTime(STRING_BUILDER, ssMap.get(STRING_BUILDER));
    timeMap.put(STRING_BUILDER, time);

    time = TimeUtil.measureExecutionTime(CONCATENATION, ssMap.get(CONCATENATION));
    timeMap.put(CONCATENATION, time);


    long maxTime = TimeUtil.calculateMaxTime(timeMap.values());

    System.out.println("\nHow many times faster the given method according to the slowest method?");
    TimeUtil.printExecutionTimesComparison(timeMap, maxTime);

  }

  private static void createStatements() {
    ssMap = new HashMap<String, Statements>();

    String key = MESSAGEFORMAT;
    Statements value = new Statements() {

      @Override
      public void runStatements() {
        MessageFormat.format("{0}{1}{2}", TEST, HELLO, EXCLAMATORY);
      }
    };
    ssMap.put(key, value);

    key = STRING_BUFFER;
    value = new Statements() {

      @Override
      public void runStatements() {
        new StringBuffer(TEST).append(HELLO).append(EXCLAMATORY).toString();
      }
    };
    ssMap.put(key, value);

    key = STRING_BUILDER;
    value = new Statements() {

      @Override
      public void runStatements() {
        new StringBuilder(TEST).append(HELLO).append(EXCLAMATORY).toString();
      }
    };
    ssMap.put(key, value);

    key = CONCATENATION;
    value = new Statements() {

      @Override
      public void runStatements() {
        new String(TEST + HELLO + EXCLAMATORY);
      }
    };
    ssMap.put(key, value);
  }
}
