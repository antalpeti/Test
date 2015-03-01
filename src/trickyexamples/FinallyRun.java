package trickyexamples;

public class FinallyRun {
  public static void main(String[] args) {
    FinallyRun obj = new FinallyRun();
    obj.returnFromTry();
    obj.returnFromCatch();
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
}
