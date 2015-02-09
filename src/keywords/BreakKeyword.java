package keywords;

public class BreakKeyword {
  public static void main(String[] args) {
    outer: for (int i = 0; i < 10; i++) {
      inner: for (int j = i; j < 6; j++) {
        System.out.println(j);
        if (j % 2 == 0) {
          System.out.println("Break Inner");
          break inner;
        }
        if (j % 5 == 0) {
          System.out.println("Break Outer");
          break outer;
        }
      }
    }
  }
}
