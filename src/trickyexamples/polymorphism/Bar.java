package trickyexamples.polymorphism;

public class Bar extends Foo {
  public int a;

  public Bar() {
    a = 2;
  }

  @Override
  public void add() {
    a = a + 5;
  }
}
