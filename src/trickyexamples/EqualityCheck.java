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

  public static void main(String[] args) {
    checkNotNumbers();
  }
}
