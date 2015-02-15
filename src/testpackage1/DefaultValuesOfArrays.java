package testpackage1;

public class DefaultValuesOfArrays {
  void initAndPrintOut() {
    int[] i = new int[10];
    for (int a : i) {
      System.out.println(a);
    }
    double[] d = new double[10];
    for (double a : d) {
      System.out.println(a);
    }

    String[] s = new String[10];
    for (String a : s) {
      System.out.println(a);
    }
  }

  public static void main(String[] args) {
    DefaultValuesOfArrays obj = new DefaultValuesOfArrays();
    obj.initAndPrintOut();
  }
}
