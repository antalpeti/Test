package trickyexamples;

import java.util.List;

public class InnerClassesDemo {
  public static void main(String[] args) {
    OuterClass oc = new OuterClass();
    oc.callMethods();

    OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();
    sic.executeDefaultMethodSIC();
    sic.defaultMemberSIC = true;
    sic.executePublicSIC();

    OuterClass.PublicInnerClass pic = oc.new PublicInnerClass();
    List<Integer> extracted = pic.getPrivateMemberOC();

    for (int i = 0; i < 10; i++) {
      extracted.add(i);
    }
    for (Integer num : pic.getPrivateMemberOC()) {
      System.out.println(num);
    }
    System.out.println(pic.publicMemberPriIC);
  }
}
