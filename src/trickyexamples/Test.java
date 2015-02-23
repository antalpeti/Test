package trickyexamples;

public class Test {
  static int i = 2;

  public static void myInt(int i) {
    System.out.print(i);
  }

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

    // Covariant return type
    System.out.println();
    A a = new B();
    a.getObj();

    // Upcasting
    Test[] tests = new Test[10];
    Object[] objects = tests;
    try {
      objects[1] = new Object(); // this row thrown the exception
      tests[1].toString();
    } catch (ArrayStoreException e) {
      System.out.println("ArrayStoreException thrown");
    }

  }

  static class C {
  }

  static class D extends C {
  }

  static class A {
    public C getObj() {
      System.out.println("class A - return C");
      return new C();
    }
  }

  static class B extends A {
    @Override
    public D getObj() {
      System.out.println("class B - return D");
      return new D();
    }
  }
}
