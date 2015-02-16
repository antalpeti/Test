package testpackage2;

public class B extends A {
  public B() {}

  @Override
  void play() {
    super.play();
    System.out.println("Play from B.");
  }
}
