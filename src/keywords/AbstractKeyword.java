package keywords;

/**
 * Don't need to implement any method from the interface in case of abstract class.
 */
public abstract class AbstractKeyword implements InterfaceKeyword {
  @Override
  public void method1() {
    System.out.println("This is implementation of method1.");
  }

  public abstract void method3();

  public void method4() {
    System.out.println("This is implementation of method4.");
  }

  public static void main(String[] args) {
    AbstractKeyword obj = new AbstractKeyword() {

      @Override
      public void method2() {
        System.out.println("This is implementation of method2 inside abstract class.");

      }

      @Override
      public void method3() {
        System.out.println("This is implementation of method3 inside abstract class.");

      }
    };
    obj.method1();
    obj.method2();
    obj.method3();
    obj.method4();

  }
}
