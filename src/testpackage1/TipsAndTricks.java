package testpackage1;

import static java.util.Arrays.sort;

import java.awt.Color;
import java.util.ArrayList;

/**
 * <ol>
 * <li>Content assist</li>
 * <li>Content assist in Javadoc comments</li>
 * <li>Content assist for static imports</li>
 * <li>Suppress types in content assist</li>
 * <li>Content assist for variable, method parameter and field name completions</li>
 * <li>Content assist for variable with unresolved type</li>
 * <li>Content assist after instanceof condition</li>
 * <li>Parameter hints</li>
 * <li>Content assist on anonymous classes</li>
 * <li>Toggle between inserting and replacing content assist</li>
 * <li>Incremental content assist</li>
 * <li>Camel case support in code completion</li>
 * <li>Use ';' key to insert method invocation</li>
 * <li>Customize content assist categories</li>
 * <li>Create getters and setters</li>
 * <li>Create getters and setters quick assist</li>
 * <li>Use content assist to create getter and setters</li>
 * <li>Delete getters and setters together with a field</li>
 * <li>Create delegate methods</li>
 * <li>Create <code>hashCode()</code> and <code>equals()</code></li>
 * <li>Use templates to create SWT widgets</li>
 * <li>Create your own templates</li>
 * <li>Use Quick Fix to create a new method</li>
 * <li>Use Quick Fix to change a method signature</li>
 * <li>Use content assist to create a constructor stub</li>
 * <li>Create new fields from parameters</li>
 * <li>Use content assist to override a method</li>
 * <li>Use Quick Fix to add unimplemented methods</li>
 * <li>Use Clean Up to add unimplemented methods</li>
 * <li>Override a method from a base class</li>
 * <li>Rename in file</li>
 * <li>Use Quick Fix to handle exceptions</li>
 * <li>Less typing for assignments</li>
 * <li>Less work with cast expressions</li>
 * <li>Assign a cast expression</li>
 * <li>Surround lines</li>
 * <li>Create 'for' loops</li>
 * <li>Migrate anonymous class creations to lambda expressions and back</li>
 * </ol>
 */
public class TipsAndTricks {
  private int var;

  private String name;

  /**
   * <p>
   * <b>Create delegate methods</b> - To create a delegate method for a field select the field's
   * declaration and invoke <b>Source &gt; Generate Delegate Methods</b>.
   * </p>
   *
   * @return
   */
  public String trim() {
    return name.trim();
  }

  private static boolean isOk;

  /**
   * <b>Use content assist to create getter and setters</b> - Another way to create getters and
   * setters is using content assist. Set the cursor in the type body between members and press
   * <b>Ctrl+Space</b> to get the proposals that create a getter or setter method stub.
   */
  @SuppressWarnings("unused")
  private long num;

  /**
   * <p>
   * <b>Content assist for variable, method parameter and field name completions</b> - Java > Code
   * Style
   * </p>
   */
  @SuppressWarnings("unused")
  private Color color;

  private int i;

  /**
   * This is a delegated method.
   *
   * @param index
   * @return
   */
  public char charAt(int index) {
    return name.charAt(index);
  }

  /**
   * <p>
   * <b>Suppress types in content assist</b> - Java > Appearance > Type Filters
   * </p>
   */
  @SuppressWarnings("unused")
  private void notVisibleFeatures() {

  }

  /**
   * <p>
   * <b>Content assist for static imports.</b> - Java > Editor > Content Assist > Favorites
   * </p>
   *
   * <p>
   * <b>Content assist for variable with unresolved type</b> - Java > Editor > Content Assist > Add
   * import instead of qualified name
   * </p>
   *
   * <p>
   * <b>Content assist after instanceof condition</b>
   * </p>
   *
   * <p>
   * <b>Parameter hints</b> - Ctrl+Shift+Space
   * </p>
   *
   * <p>
   * <b>Content assist on anonymous classes</b> - after "new " and the beginning of an abstract
   * class or interface name press Ctrl+Space
   * </p>
   *
   * <p>
   * <b>Toggle between inserting and replacing content assist</b> - You can temporarily toggle the
   * behavior by pressing and holding the Ctrl key while selecting the completion.
   * </p>
   *
   * <p>
   * <b>Incremental content assist</b> - Insert common prefixes automatically
   * </p>
   *
   * <p>
   * <b>Camel case support in code completion</b> - This support can be disabled using the <b>Show
   * camel case matches</b> preference
   * </p>
   *
   * <p>
   * <b>Use ';' key to insert method invocation</b> - You can use the semicolon (;) key to select
   * any method invocation proposal from the content assist popup.
   * </p>
   *
   * <p>
   * <b>Customize content assist categories</b> - Repeatedly invoking content assist (Ctrl+Space)
   * cycles through different proposal categories.
   * </p>
   */
  public void foo(Object obj) {
    int a[] = new int[10];
    sort(a);

    ArrayList<Integer> list = new ArrayList<Integer>();

    if (obj instanceof Exception) {
      System.out.println(((Exception) obj).getMessage());
    }

    "1".equals("2");

    new Interface() {

      @Override
      public int someMethod() {
        return 0;
      }
    };

    String s = quickFixMethod(1, 2, "");
    System.out.println(s);
    String quickFixMethod = quickFixMethod(3, 4);
    System.out.println(quickFixMethod);
  }

  private String quickFixMethod(int i, int j, String string) {
    return quickFixMethod(i, j);
  }

  private String quickFixMethod(int i, int j) {
    this.setI(i);
    return "Method created with Quick Fix.";
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

  /**
   * <p>
   * <b>Create getters and setters</b> - To create getter and setter methods for a field, select the
   * field's declaration and invoke <b>Source &gt; Generate Getter and Setter</b>.
   * </p>
   *
   * <p>
   * <b>Create getters and setters quick assist</b> - A quick assist <b>(Ctrl+1)</b> is available on
   * fields to create getters and setters.
   * </p>
   *
   * <p>
   * <b>Delete getters and setters together with a field</b> - When you delete a field from within a
   * view, Eclipse can propose deleting its Getter and Setter methods.
   * </p>
   *
   * @param name
   */
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



  /**
   * Content assist
   *
   * @param some Content assist in Javadoc comments.
   */
  public static void publicStaticMethod(int some) {
    System.out.println("This is a public static method.");
  }

  public static void main(String[] args) {
    TipsAndTricks obj = new TipsAndTricks();
    obj.privateMethod();
    System.out.println(TipsAndTricks.privateStaticMethod());
    String[] sa = new String[] {"abc", "def", "ghl"};
    for (int i = sa.length - 1; i >= 0; i--) {
      System.out.print(sa[i]);
    }
    System.out.println();
    int[] ar = new int[] {1, 2, 3, 4, 5};
    for (int i = 0; i < ar.length; i++) {
      System.out.print(ar[i]);
    }
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }
}
