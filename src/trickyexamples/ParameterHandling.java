package trickyexamples;

import java.util.ArrayList;
import java.util.List;

public class ParameterHandling {
  private static void doPrimitive(int p) {
    p *= 2;
  }

  private static void doString(String s) {
    s += s;
  }

  private static void doArrayList(List<String> l) {
    l.add("something");
    l = new ArrayList<String>();
    l.add("something else");
  }

  public static void foo(Dog d) {
    d.getName().equals("Max"); // true
    d = new Dog("Fifi");
    d.getName().equals("Fifi"); // true
  }

  public static void bar(Dog d) {
    d.getName().equals("Max"); // true
    d.setName("Fifi");
    d.getName().equals("Fifi"); // true
  }

  public static void main(String[] args) {
    int p = 1;
    String s = "str";
    List<String> l = new ArrayList<String>();
    System.out.println(p);
    System.out.println(s);
    System.out.println(l);
    doPrimitive(p);
    doString(s);
    doArrayList(l);
    System.out.println(p);
    System.out.println(s);
    System.out.println(l);

    Dog aDog = new Dog("Max");
    foo(aDog);
    if (aDog.getName().equals("Max")) { // true
      System.out.println("Java passes by value.");
    } else if (aDog.getName().equals("Fifi")) {
      System.out.println("Java passes by reference.");
    }

    bar(aDog);
    if (aDog.getName().equals("Max")) {
      System.out.println("Java passes by value.");
    } else if (aDog.getName().equals("Fifi")) { // true
      System.out.println("Java passes by reference.");
    }
  }
}
