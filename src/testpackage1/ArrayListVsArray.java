package testpackage1;

import java.util.ArrayList;

public class ArrayListVsArray {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    // autoboxing
    al.add(1);
    al.add(2);
    // unboxing
    int a0 = al.get(0);
    int a1 = al.get(1);
    for (Integer i : al) {
      System.out.println(i);
    }
    System.out.println(a0);
    System.out.println(a1);

    int[] a = new int[2];
    a[1] = 1;
    for (int i : a) {
      System.out.println(i);
    }
  }
}
