package performance;

import java.util.HashMap;
import java.util.Map;


public class EnumStringComparison {
  private static final String STRING1 = "Equals Two Strings: ";
  private static final String STRING2 = "Equals IgnoreCase Two String: ";
  private static final String STRING3 = "Equals Enum String and String: ";
  private static final String STRING4 = "Equals IgnoreCase Enum String and String: ";
  private static final String STRING5 = "Equals String and Enum String: ";
  private static final String STRING6 = "Equals IgnoreCase String and Enum String: ";
  private static final String STRING7 = "Equals Two Enum Strings: ";
  private static final String STRING8 = "Equals IgnoreCase Two Enum Strings: ";
  private static final String STRING9 = "Equals Two Enum: ";
  private static final String TEXT_TWO = "TextTwo";
  private static final String TEXT_ONE = "TextOne";
  private static Map<String, Statements> ssMap;
  private static Map<String, Long> timeMap;

  public static void main(String[] args) {
    createStatements();
    timeMap = new HashMap<String, Long>();

    long time = TimeUtil.mesureExecutionTime(STRING1, ssMap.get(STRING1));
    timeMap.put(STRING1, time);
    time = TimeUtil.mesureExecutionTime(STRING2, ssMap.get(STRING2));
    timeMap.put(STRING2, time);
    time = TimeUtil.mesureExecutionTime(STRING3, ssMap.get(STRING3));
    timeMap.put(STRING3, time);
    time = TimeUtil.mesureExecutionTime(STRING4, ssMap.get(STRING4));
    timeMap.put(STRING4, time);
    time = TimeUtil.mesureExecutionTime(STRING5, ssMap.get(STRING5));
    timeMap.put(STRING5, time);
    time = TimeUtil.mesureExecutionTime(STRING6, ssMap.get(STRING6));
    timeMap.put(STRING6, time);
    time = TimeUtil.mesureExecutionTime(STRING7, ssMap.get(STRING7));
    timeMap.put(STRING7, time);
    time = TimeUtil.mesureExecutionTime(STRING8, ssMap.get(STRING8));
    timeMap.put(STRING8, time);
    time = TimeUtil.mesureExecutionTime(STRING9, ssMap.get(STRING9));
    timeMap.put(STRING9, time);


    long maxTime = TimeUtil.calculateMaxTime(timeMap.values());

    System.out.println("\nHow many times faster the given method according to the slowest method?");
    TimeUtil.printExecutionTimes(timeMap, maxTime);
  }

  private static void createStatements() {
    ssMap = new HashMap<String, Statements>();

    String key = STRING1;
    Statements value = new Statements() {

      @Override
      public void runStatements() {
        TEXT_ONE.equals(TEXT_TWO);
      }
    };
    ssMap.put(key, value);

    key = STRING2;
    value = new Statements() {

      @Override
      public void runStatements() {
        TEXT_ONE.equalsIgnoreCase(TEXT_TWO);
      }
    };
    ssMap.put(key, value);

    key = STRING3;
    value = new Statements() {

      @Override
      public void runStatements() {
        TextTypes.ONE.getType().equals(TEXT_TWO);
      }
    };
    ssMap.put(key, value);

    key = STRING4;
    value = new Statements() {

      @Override
      public void runStatements() {
        TextTypes.ONE.getType().equalsIgnoreCase(TEXT_TWO);
      }
    };
    ssMap.put(key, value);

    key = STRING5;
    value = new Statements() {

      @Override
      public void runStatements() {
        TEXT_ONE.equals(TextTypes.TWO.getType());
      }
    };
    ssMap.put(key, value);

    key = STRING6;
    value = new Statements() {

      @Override
      public void runStatements() {
        TEXT_ONE.equalsIgnoreCase(TextTypes.TWO.getType());
      }
    };
    ssMap.put(key, value);

    key = STRING7;
    value = new Statements() {

      @Override
      public void runStatements() {
        TextTypes.ONE.getType().equals(TextTypes.TWO.getType());
      }
    };
    ssMap.put(key, value);

    key = STRING8;
    value = new Statements() {

      @Override
      public void runStatements() {
        TextTypes.ONE.getType().equalsIgnoreCase(TextTypes.TWO.getType());
      }
    };
    ssMap.put(key, value);

    key = STRING9;
    value = new Statements() {

      @Override
      public void runStatements() {
        TextTypes.ONE.equals(TextTypes.TWO);
      }
    };
    ssMap.put(key, value);
  }



}
