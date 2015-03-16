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

  public static void main(String[] args) {
    ExceptionHandling eh = new ExceptionHandling();
    eh.method2();
  }
}
