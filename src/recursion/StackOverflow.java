package recursion;

public class StackOverflow {
  public static void main(String[] args) {
    StackOverflow so = new StackOverflow();
    int num = 0;
    so.toInfinity(num);
    so.toInfinity();
  }

  int toInfinity(int number) {
    return toInfinity(++number);
  }

  public void toInfinity() {
    toInfinity();
  }
}
