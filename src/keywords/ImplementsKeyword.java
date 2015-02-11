package keywords;

/**
 * In case of interface the concrete class has to implements all its methods.
 */
public class ImplementsKeyword implements InterfaceKeyword {

  @Override
  public void method1() {
    System.out.println("Implementation of method1");
    System.out.println("field1 = " + field1);
  }

  @Override
  public void method2() {
    System.out.println("Implementation of method2");
    System.out.println("InterfaceKeyword.field2 = " + InterfaceKeyword.field2);
  }

  public static void main(String[] args) {
    ImplementsKeyword obj = new ImplementsKeyword();
    obj.method1();
    obj.method2();
  }
}
