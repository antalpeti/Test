package trickyexamples;

import java.util.ArrayList;
import java.util.List;


public class OuterClass {

  private List<Integer> privateMemberOC = new ArrayList<Integer>();
  float defaultMemberOC;

  static class StaticInnerClass {
    boolean defaultMemberSIC;
    private String privateMemberSIC = "privateMemberSIC";

    private void executePrivateMethodSIC() {
      System.out.println(privateMemberSIC);
    }

    void executeDefaultMethodSIC() {
      executePrivateMethodSIC();
    }

    public void executePublicSIC() {
      for (int i = 0; i < 2; i++) {
        executePrivateMethodSIC();
      }
    }

    public void createPrivateStaticInnerClass() {
      PrivateStaticInnerClass psic = new PrivateStaticInnerClass();
      psic.getPrivateMemberPriIC();
      psic.privateMemberPriSIC = 2;
    }
  }

  private static class PrivateStaticInnerClass {
    private short privateMemberPriSIC;

    public short getPrivateMemberPriIC() {
      return privateMemberPriSIC;
    }
  }

  private class PrivateInnerClass {
    private int privateMemberPriIC;
    public int publicMemberPriIC = 1;
    public static final int publicStaticMemberPriIC = 2;
  }

  public class PublicInnerClass {
    public double publicMemberPriIC;

    private void executePrivateMethod() {}

    public List<Integer> getPrivateMemberOC() {
      executePrivateMethod();
      return privateMemberOC;
    }
  }

  private void usePrivateInnerClass() {
    PrivateInnerClass pic = new PrivateInnerClass();
    System.out.println(pic.privateMemberPriIC);
    System.out.println(pic.publicMemberPriIC);
    System.out.println(PrivateInnerClass.publicStaticMemberPriIC);
  }

  public void callMethods() {
    usePrivateInnerClass();
  }
}
