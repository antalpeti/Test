package trickyexamples;

public class Child extends Parent {
  static {
    System.out.println("child - static block");
  }

  {
    System.out.println("child - instance block");
  }

  public Child() {
    System.out.println("child - constructor");
  }

  public static void main(String[] args) {
    Child c = new Child();
    System.out.println();
    Parent p = new Child();
  }
}
