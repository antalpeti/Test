package trickyexamples;

public class SumNumbers {
  public static void main(String[] args) {
    SumNumbers obj = new SumNumbers();
    System.out.println(obj.sum(3));
    System.out.println(obj.sum(3, 0));
  }

  private int sum(int n) {
    if (n <= 0) {
      return 0;
    }
    return n + sum(n - 1);
  }

  private int sum(int n, int ac) {
    ac += n;
    if (n == 0) {
      return ac;
    }
    return sum(n - 1, ac);
  }
}
