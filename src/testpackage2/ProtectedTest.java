package testpackage2;

import testpackage1.Protected;

/**
 * Package and protected is not see from an another package. Except in case of inheritance.
 */
public class ProtectedTest extends Protected {
  public static void main(String[] args) {
    Protected p = new Protected();
    // p.bark();
    p.blow();
    // p.meow();

    ProtectedTest pt = new ProtectedTest();
    pt.blow();
    pt.meow();
  }
}
