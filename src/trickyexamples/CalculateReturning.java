package trickyexamples;

public class CalculateReturning {
  public static void calculateReturning(int cost, int paid) {
    System.out.println("Cost: " + cost + " Paid: " + paid);
    System.out.println("Returns: ");
    if (cost % 5 >= 3) {
      cost += 5 - cost % 5;
    } else {
      cost -= cost % 5;
    }
    int diff = paid - cost;
    if (diff > 0) {
      int[] money = new int[] {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
      int[] pieces = new int[money.length];
      for (int i = 0; i < money.length; i++) {
        pieces[i] = diff / money[i];
        diff = diff % money[i];
        System.out.println(money[i] + " : " + pieces[i]);
      }
    } else {
      System.out.println("Paid more!");
    }
  }

  public static void main(String[] args) {
    calculateReturning(100, 20100);
    calculateReturning(1345, 9000);
    calculateReturning(1500, 12000);
    calculateReturning(1503, 12000);
    calculateReturning(992, 4800);
    calculateReturning(12, 20);
    calculateReturning(13, 20);
  }
}
