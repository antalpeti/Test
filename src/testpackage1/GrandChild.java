package testpackage1;

public class GrandChild extends Child {

  @Override
  public void msg() {
    System.out.println("Message form GrandChild");
    super.msg();
  }

  public static void main(String[] args) {
    try {
      Class<?> c = Class.forName("testpackage1.GrandChild");
      GrandChild gc = (GrandChild) c.newInstance();
      gc.msg();
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
