package testpackage2;

public class C extends B {
  public C() {

  }

  @Override
  void play() {
    super.play();
    System.out.println("Play from C.");
  }

  public static void main(String[] args) {
    C c = new C();
    c.play();
  }
}
