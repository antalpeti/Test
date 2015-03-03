package keywords;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FinalKeyword {
  final int[] ia = new int[] {1, 2};
  final long[] la;
  final List<String> sl = new ArrayList<String>();
  final Set<Integer> is;

  public FinalKeyword() {
    la = new long[] {7L, 6L};
    is = new HashSet<Integer>();
  }

  private void printOut() {
    System.out.println("\nint array");
    for (int i = 0; i < ia.length; i++) {
      System.out.print(ia[i] + " ");
    }
    System.out.println("\nlong array");
    for (int i = 0; i < ia.length; i++) {
      System.out.print(la[i] + " ");
    }
    System.out.println("\nString list");
    for (String s : sl) {
      System.out.print(s + " ");
    }
    System.out.println("\nInteger set");
    for (Integer i : is) {
      System.out.print(i + " ");
    }
  }

  private void extend() {
    // ia = new int[] {1, 2, 3}; // compiler error
    // la = new long[] {5L, 6L, 7L}; // compiler error
    // sl = new ArrayList<String>(); // compiler error
    sl.add("one");
    sl.add("two");
    // is = new HashSet<Integer>();// compiler error
    is.add(3);
    is.add(4);
    is.add(5);
  }

  public static void main(String[] args) {
    FinalKeyword fk = new FinalKeyword();
    fk.printOut();
    fk.extend();
    fk.printOut();

  }
}
