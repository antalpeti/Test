package testpackage1;

/**
 * Default constructor form the Parent class will be called implicitly.
 */
public class Child extends Parent {
  int childField;
  int fromParentField;
  String name;

  public Child() {
    // implicitly called the super()
    childField = 5;
    fromParentField = super.parentField;
  }

  public Child(String name) {
    // super(); // explicitly called the super()
    this.name = name;
  }

  @Override
  public void msg() {
    System.out.println("Message form Child");
  }

  public static void main(String[] args) {
    Child child = new Child();
    System.out.println(child.childField);
    System.out.println(child.fromParentField);

    Child child1 = new Child("another");
    System.out.println(child1.childField);
    System.out.println(child1.fromParentField);
    System.out.println(child1.name);
  }

}
