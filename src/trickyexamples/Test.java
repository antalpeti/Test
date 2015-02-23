package trickyexamples;

public class Test {
  static int i = 2;

  public static void myInt(int i) {
    System.out.print(i);
  }

  public static void main(String[] args) {
    Foo f = new Bar();
    f.add();
    System.out.println("a = " + f.a);

    {
      @SuppressWarnings("unused")
      int i = 3;
    }

    myInt(i);
    System.out.print(i);
    i = 1;
    System.out.print(i);
  }
}
