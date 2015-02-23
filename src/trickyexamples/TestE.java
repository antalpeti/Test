package trickyexamples;

public class TestE {
  public static void main(String[] args) {
    E a = new E();
    E b = new E() {
      @Override
      public String toString() {
        return "B";
      }
    };

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("a and b : " + a.getClass().equals(b.getClass()));
    System.out.println("a.getClass() : " + a.getClass());
    System.out.println("b.getClass() : " + b.getClass());
  }
}
