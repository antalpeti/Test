package trickyexamples.inheritance;

public class Implementer implements IfA, IfB {

  @Override
  public void method() {
    System.out.println("Something bright.");
  }

  public static void main(String[] args) {
    Implementer obj = new Implementer();
    obj.method();
  }
}
