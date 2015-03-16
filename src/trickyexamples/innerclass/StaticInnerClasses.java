package trickyexamples.innerclass;


public class StaticInnerClasses {
  public static void main(String[] args) {
    // Covariant return type
    System.out.println();
    A a = new B();
    a.getObj();
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
