package trickyexamples.inheritance;

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

  public Child(String str) {
    System.out.println("child - one parameter constructor");
  }

  public Child(String str, int num) {
    super(str);
    System.out.println("child - two parameter constructor");
  }

  public static void main(String[] args) {
    Child c = new Child();
    System.out.println();
    Parent p = new Child();
    System.out.println("----");
    p = new Child("parameter");
    System.out.println("----");
    p = new Child("parameter", 2);
  }

}
