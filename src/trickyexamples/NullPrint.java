package trickyexamples;

public class NullPrint {
  static String s1;
  static String s2;

  public static void main(String[] args) {
    s2 = s1 + s2;
    System.out.println(s2);
  }
}
