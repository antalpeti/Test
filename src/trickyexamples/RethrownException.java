package trickyexamples;

public class RethrownException {
  private void doStuff() {
    throw new IllegalStateException();
  }

  private void handleException() {
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
    RethrownException obj = new RethrownException();
    obj.handleException();
  }
}
