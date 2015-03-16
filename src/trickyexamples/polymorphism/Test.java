package trickyexamples.polymorphism;


public class Test {
  static int i = 2;

  public static void myInt(int i) {
    System.out.print(i);
  }

  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    // Polymorphism
    Foo f = new Bar();
    f.add();
    System.out.println("a = " + f.a);

    // Variable scopes
    {
      @SuppressWarnings("unused")
      int i = 3;
    }
    myInt(i);
    System.out.print(i);
    i = 1;
    System.out.print(i);

    // Dynamic class loading and instantiation
    try {
      String s = "java.util.ArrayList";
      @SuppressWarnings("rawtypes")
      Class c = Class.forName(s);
      Object o = c.newInstance();
      @SuppressWarnings("rawtypes")
      java.util.List l = (java.util.ArrayList) o;
      l.add("list");
      System.out.println(l);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
