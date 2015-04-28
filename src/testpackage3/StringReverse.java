package testpackage3;

public class StringReverse {
  public static void main(String[] args) {
    System.out.println(reverseString("Test"));
    System.out.println(reverseString("Reverse"));
    System.out.println(reverseString("Another"));
    System.out.println(reverseString("Abc"));
    System.out.println(reverseString("Ab"));
  }

  public static String reverseString(String input) {
    char[] ca = input.toCharArray();
    int len = ca.length;
    for (int i = 0; i < len / 2; i++) {
      char tmp = ca[i];
      ca[i] = ca[len - 1 - i];
      ca[len - 1 - i] = tmp;
    }
    return new String(ca);
  }
}
