package trickyexamples.inheritance;

public class Parent {
  static {
    System.out.println("parent - static block");
  }

  {
    System.out.println("parent - instance block");
  }

  public Parent() {
    System.out.println("parent - constructor");
  }

  public Parent(String str) {
    System.out.println("parent - one parameter constructor");
  }
}
