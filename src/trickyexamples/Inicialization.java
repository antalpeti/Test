package trickyexamples;

import java.util.Vector;

public class Inicialization {
  final Vector v;

  public Inicialization() {
    v = new Vector<Integer>(); // without this line compilation error
  }

  public static void main(String[] args) {
    System.out.println("This is cool :)");
  }
}
