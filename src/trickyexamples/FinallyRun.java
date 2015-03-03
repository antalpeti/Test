package trickyexamples;

public class FinallyRun {
  public static void main(String[] args) {
    FinallyRun obj = new FinallyRun();
    System.out.println("--returnFromTry--");
    obj.returnFromTry();
    System.out.println("--returnFromCatch--");
    obj.returnFromCatch();
    System.out.println("--returnFromFinally--");
    System.out.println(obj.returnFromFinally());
  }

  private void returnFromTry() {
    try {
      System.out.println("This is try block.");
      return;
    } catch (Exception e) {
    } finally {
      System.out.println("This is finally block.");
    }
  }

  private void returnFromCatch() {
    try {
      throw new Exception();
    } catch (Exception e) {
      System.out.println("This is catch block.");
      return;
    } finally {
      System.out.println("This is finally block.");
    }
  }

  @SuppressWarnings("finally")
  private int returnFromFinally() {
    try {
      System.out.println("try");
      @SuppressWarnings("unused")
      int i = 10 / 0;
      return 1;
    } catch (Exception e) {
      System.out.println("catch");
    } finally {
      System.out.println("finally");
      return 2;
    }
  }
}
