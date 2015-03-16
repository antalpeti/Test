package trickyexamples;

public class EqualityCheck {
  private static void checkNotNumbers() {
    float result = Math.min(Float.NaN, Float.POSITIVE_INFINITY);
    System.out.println(result);
    result = Math.min(Float.NaN, Float.NEGATIVE_INFINITY);
    System.out.println(result);
    result = Math.min(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
    System.out.println(result);

    result = Math.max(Float.NaN, Float.POSITIVE_INFINITY);
    System.out.println(result);
    result = Math.max(Float.NaN, Float.NEGATIVE_INFINITY);
    System.out.println(result);
    result = Math.max(Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY);
    System.out.println(result);
  }

  private static void checkTwoZero() {
    System.out.println(0.0 == -0.0 ? false : true);
  }

  public static void main(String[] args) {
    System.out.println("--NaN, POSITIVE_INFINITY and NEGATIVE_INFINITY comparison--");
    checkNotNumbers();
    System.out.println("\n--Two zero comparison--");
    checkTwoZero();
  }
}
