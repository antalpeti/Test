package testpackage1;

public class TipsAndTricks {
  private int var;

  private String name;

  private static boolean isOk;

  /**
   * This is a delegated method.
   *
   * @param index
   * @return
   */
  public char charAt(int index) {
    return name.charAt(index);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (name == null ? 0 : name.hashCode());
    result = prime * result + var;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (!(obj instanceof TipsAndTricks)) {
      return false;
    }
    TipsAndTricks other = (TipsAndTricks) obj;
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    if (var != other.var) {
      return false;
    }
    return true;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getVar() {
    return var;
  }

  public void setVar(int var) {
    this.var = var;
  }

  public static boolean isOk() {
    return isOk;
  }

  public static void setOk(boolean isOk) {
    TipsAndTricks.isOk = isOk;
  }

  private void privateMethod() {
    System.out.println("This is a private method :)");
  }

  private static int privateStaticMethod() {
    return (int) (Math.random() * 10);
  }

  protected String protectedMethod(String msg) {
    return msg;
  }

  public boolean publicMethod(int num) {
    return num > 10;
  }

  public static void publicStaticMethod() {
    System.out.println("This is a public static method.");
  }

  public static void main(String[] args) {
    TipsAndTricks obj = new TipsAndTricks();
    obj.privateMethod();
    TipsAndTricks.privateStaticMethod();
  }
}
