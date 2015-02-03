package performance;

import java.text.MessageFormat;


public class StringConcatenation {

  private static final String STRING_BUILDER = "\nStringBuilder:";
  private static final String STRING_BUFFER = "\nStringBuffer:";
  private static final String MESSAGE_FORMAT = "\nMessageFormat:";
  private static final String NS = " ns";

  public static void main(String[] args) {

    System.out.println(MESSAGE_FORMAT);
    long start = System.nanoTime();
    MessageFormat.format("Test {0}{1}", " Hello", "!");
    long time1 = System.nanoTime() - start;
    System.out.println(time1 + NS);

    System.out.println(STRING_BUFFER);
    start = System.nanoTime();
    new StringBuffer("Test ").append("Hello").append("!").toString();
    long time2 = System.nanoTime() - start;
    System.out.println(time2 + NS);

    System.out.println(STRING_BUILDER);
    start = System.nanoTime();
    new StringBuilder("Test ").append("Hello").append("!").toString();
    long time3 = System.nanoTime() - start;
    System.out.println(time3 + NS);

    long maxTime = Math.max(time1, time2);
    maxTime = Math.max(maxTime, time3);

    System.out.println("\nHow many times faster the given method according to the slowest method?");
    System.out.println(MESSAGE_FORMAT + maxTime / time1);
    System.out.println(STRING_BUFFER + maxTime / time2);
    System.out.println(STRING_BUILDER + maxTime / time3);

  }
}
