package trickyexamples.casting;

public class Upcasting {
  public static void main(String[] args) {
    // Upcasting
    Upcasting[] tests = new Upcasting[10];
    Object[] objects = tests;
    try {
      objects[1] = new Object(); // this row thrown the exception
      tests[1].toString();
    } catch (ArrayStoreException e) {
      System.out.println("ArrayStoreException thrown");
    }
  }
}
