package trickyexamples;

public class PassByValue {
  private static void changeValue(String str) {
    str = "Something new";
  }

  public static void main(String[] args) {
    String str = "Object";
    changeValue(str);
    System.out.println(str);
  }
}
