package trickyexamples;

public class OnlyZero {
  private static void check() {
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.print(i);
      } else {
        i++;
      }
    }
  }

  public static void main(String[] args) {
    check();
  }
}
