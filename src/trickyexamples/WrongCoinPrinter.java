package trickyexamples;

public class WrongCoinPrinter {
  private static final String MESSAGE =
      "Numbders of printer: %d  Sum of weight of coins: %d  Number of wrong printer: %d\n";

  public static void main(String[] args) {
    System.out.format(MESSAGE, 1, 2, findWrongPrinter(1, 2));
    System.out.format(MESSAGE, 2, 5, findWrongPrinter(2, 5));
    System.out.format(MESSAGE, 3, 8, findWrongPrinter(3, 8));
    System.out.format(MESSAGE, 4, 13, findWrongPrinter(4, 13));
    System.out.format(MESSAGE, 5, 19, findWrongPrinter(5, 19));
    System.out.format(MESSAGE, 6, 25, findWrongPrinter(6, 25));
    System.out.format(MESSAGE, 7, 33, findWrongPrinter(7, 33));
    System.out.format(MESSAGE, 8, 42, findWrongPrinter(8, 43));
    System.out.format(MESSAGE, 9, 54, findWrongPrinter(9, 54));
    System.out.format(MESSAGE, 10, 57, findWrongPrinter(10, 57));
  }

  /**
   * The concept is that we have n printers. We print out different numbers of coins. We can print
   * out as many coins as we want but only one measure is permitted. For example the 1st printer
   * only one coin, the 2nd printer 2 coins, and so on to n coins. The wrong printer give us 2 unit
   * of weight of coin the good printer give us 1 unit of weight of coin. If all printers is good
   * then the sum is (1 + n) * (n / 2).
   *
   * @param printerNumber
   * @param coinsWeight
   * @return
   */
  private static int findWrongPrinter(int printerNumber, int coinsWeight) {
    int oneCoinsSum = (int) ((1 + printerNumber) * (printerNumber / 2.0));
    return coinsWeight - oneCoinsSum;
  }
}
