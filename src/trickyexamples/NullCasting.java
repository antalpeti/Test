package trickyexamples;

public class NullCasting {
  public static void main(String[] args) {
    Object a = null;
    int i = (Integer) a;
    System.out.println("Ez az eredmény: " + i);
  }
}
