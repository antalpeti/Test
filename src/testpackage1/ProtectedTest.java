package testpackage1;

/**
 * Try to verify that a protected method is can see inside the same package. So don't need to
 * inherit the class.
 */
public class ProtectedTest {
  public static void main(String[] args) {
    Protected p = new Protected();
    p.bark();
    p.blow();
    p.meow();
  }
}
