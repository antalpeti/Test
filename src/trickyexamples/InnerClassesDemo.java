package trickyexamples;

import java.util.List;

public class InnerClassesDemo {
  public static void main(String[] args) {
    OuterClass ocObject = new OuterClass();
    ocObject.callMethods();

    OuterClass.StaticInnerClass sicObject = new OuterClass.StaticInnerClass();
    sicObject.executeDefaultMethodSIC();
    sicObject.defaultMemberSIC = true;
    sicObject.executePublicSIC();

    OuterClass.PublicInnerClass picObject = ocObject.new PublicInnerClass();
    List<Integer> extracted = picObject.getPrivateMemberOC();

    for (int i = 0; i < 10; i++) {
      extracted.add(i);
    }
    for (Integer num : picObject.getPrivateMemberOC()) {
      System.out.println(num);
    }
    System.out.println(picObject.publicMemberPriIC);
  }
}
