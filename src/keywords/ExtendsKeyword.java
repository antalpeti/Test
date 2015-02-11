package keywords;

/**
 * In case of abstract class only the unimplemented methods has to be implement in the concrete
 * class.
 */
public class ExtendsKeyword extends AbstractKeyword {

  @Override
  public void method2() {
    System.out.println("This is implementation of method2.");
  }

  @Override
  public void method3() {
    System.out.println("This is implementation of method3.");
  }

  @Override
  public void method4() {
    System.out.println("This is override implementation of method4.");
  }


  public void method5() {
    System.out.println("This is implementation of method5.");
  }

  public static void main(String[] args) {
    // InterfaceKeyword obj = new ExtendsKeyword();
    // AbstractKeyword obj = new ExtendsKeyword();
    ExtendsKeyword obj = new ExtendsKeyword();
    obj.method1(); // Can use InterfaceKeyword, AbstractKeyword, ExtendsKeyword reference
    obj.method2(); // Can use InterfaceKeyword, AbstractKeyword, ExtendsKeyword reference
    obj.method3(); // Can use AbstractKeyword, ExtendsKeyword reference
    obj.method4(); // Can use AbstractKeyword, ExtendsKeyword reference
    obj.method5(); // Can use ExtendsKeyword reference
  }

}
