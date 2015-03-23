package testpackage1;

public class EqualsTest {

  public static void main(String[] args) {

    String s1 = "abc";
    String s2 = s1;
    String s5 = "abc";
    String s3 = new String("abc");
    String s4 = new String("abc");
    System.out.println("s1 == s5 comparison : " + (s1 == s5));
    System.out.println("s1 == s2 comparison : " + (s1 == s2));
    System.out.println("Using s1.equals(s2) method : " + s1.equals(s2));
    System.out.println("s1 == s4 comparison : " + (s1 == s4));
    System.out.println("s2 == s4 comparison : " + (s2 == s4));
    System.out.println("s3 == s4 comparison : " + (s3 == s4));
    System.out.println("Using s1.equals(s4) method : " + s1.equals(s4));
    System.out.println("Using s2.equals(s4) method : " + s2.equals(s4));
    System.out.println("Using s3.equals(s4) method : " + s3.equals(s4));
  }
}
