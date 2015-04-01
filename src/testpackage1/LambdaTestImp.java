package testpackage1;

import java.util.ArrayList;

public class LambdaTestImp {
  public static void main(String[] args) {
    ArrayList<LambdaTestInf> al = new ArrayList<LambdaTestInf>();
    al.add(s -> s.length());
  }
}
