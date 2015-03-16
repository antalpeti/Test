package trickyexamples;

public class ExceptionHandling {
  private void method1() throws Exception {
    throw new RuntimeException();
  }

  private void method2() {
    try {
      method1();
    } catch (RuntimeException rte) {
      System.out.println("RuntimeException caught.");
    } catch (Exception e) {
      System.out.println("Exception caught.");
    }
  }

  private void doStuff() {
    throw new IllegalStateException();
  }

  private void rethrownException() {
    try {
      this.doStuff();
    } catch (RuntimeException e) {
      try {
        throw new Exception();
      } catch (Exception e1) {
        System.out.println("Exception occured.");
      }
    } finally {
      System.out.println("Finally run.");
    }
  }

  public static void main(String[] args) {
    ExceptionHandling eh = new ExceptionHandling();
    System.out.println("--Example about Exception propagation.--");
    eh.method2();
    System.out.println("\n--Example about rethrown exception and finally block usage--");
    eh.rethrownException();
  }
}
