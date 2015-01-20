package testpackage1;

public class Protected {
  /**
   * Package visible.
   */
  void bark() {
    System.out.println("Bark");
  }

  /**
   * Package and inherit visible.
   */
  protected void meow() {
    System.out.println("Meow");
  }

  /**
   * Everyone can see it.
   */
  public void blow() {
    System.out.println("Blow");
  }
}
