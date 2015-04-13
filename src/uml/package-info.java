/**
 * Contains some examples about usage of UML connections.
 *
 * <h2>Class Diagram Example (private fields, public methods)</h2>
 * <p>
 * The Car class has private instance variables carColor, carPrice denoted by (-) in the UML Class
 * diagram. Similarly if this was public then it would have been represented as (+), if was
 * protected then it is denoted by (#). The package visibility is defined by (~).<br>
 * The return type of the instance variables or the methods are represented next to the colon (:)
 * sign. Structure: [visibility] [multiplicity] [:type [=default value]] {property string} Example:
 * carPrice : double = 0.0
 * </p>
 * <head> <link rel="stylesheet" type="text/css" href="../../files/mystyle.css"> </head>
 * <table>
 * <tbody>
 * <tr>
 * <th>Java visibility</th>
 * <th>UML Notation</th>
 * </tr>
 * <tr>
 * <td><b>public</b></td>
 * <td>+</td>
 * </tr>
 * <tr>
 * <td><b>private</b></td>
 * <td>-</td>
 * </tr>
 * <tr>
 * <td><b>Protected</b></td>
 * <td>#</td>
 * </tr>
 * <tr>
 * <td>package</td>
 * <td>~</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * <img src="./class_diagram_example.gif"
 * alt="Class Diagram Example (private fields, public methods)" width="100%">
 * </p>
 *
 * <h2>Class Diagram Example 2 (static fields, static methods)</h2>
 * <p>
 * The static data is represented with an underline.
 * </p>
 * <p>
 * <img src="./class_diagram_example_2.gif"
 * alt="Class Diagram Example 2 (static fields, static methods)" width="100%">
 * </p>
 *
 * <h2>Association Example</h2>
 * <p>
 * The association represents the static relationship between two classes along with the
 * multiplicity. Association are represented as thin line connecting two classes. Association can be
 * unidirectional (shown by arrow at one end) or bidirectional (shown by arrow at both end).
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <td>0..1</td>
 * <td>No instances or one instance</td>
 * <td>A flight seat can have no or one passenger only</td>
 * </tr>
 * <tr>
 * <td>1</td>
 * <td>Exactly one instance</td>
 * <td>An order can have only one customer</td>
 * </tr>
 * <tr>
 * <td>0..* or *</td>
 * <td>Zero or more instances</td>
 * <td>A class can have zero or more students.</td>
 * </tr>
 * <tr>
 * <td>1..*</td>
 * <td>One or more instances (at least one)</td>
 * <td>A flight can have one or more passenger</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * <img src="./association_example.gif" alt="Association Example" width="100%">
 * </p>
 *
 * <h2>Multiplicity Example</h2>
 * <p>
 * The below diagram explains a unidirectional association with a one to may relationship. Both use
 * of ArrayList and Array is for illustration purposes only.
 * </p>
 * <p>
 * <img src="./multiplicity_example.gif" alt="Multiplicity Example" width="100%">
 * </p>
 *
 * <h2>Generalization Example</h2>
 * <p>
 * This property represents the inheritance feature of the object oriented concept. In Java this can
 * relate to the “extends” keyword. The inheritance should ideally follow the Liskov Substitution
 * Principle i.e. the subtype should be able to substitute for its supertype. It helps to make the
 * code implicitly follow the Open Close Principle i.e. Open for extension but closed for
 * modification.
 * </p>
 * <p>
 * <img src="./generalization_example.gif" alt="Generalization Example" width="100%">
 * </p>
 *
 * <h2>Realization Example</h2>
 * <p>
 * This is related to the relationship between the class and the interface. The realization is
 * equivalent to the “implements” keyword in Java.
 * </p>
 * <p>
 * <img src="./realization_example.gif" alt="Realization Example" width="100%">
 * </p>
 *
 * <h2>Dependency</h2>
 * <p>
 * Dependency is a relationship that shows that a class is dependent on another class for its
 * existence or implementation. Dependency relationship is shown as a dotted line with an arrow from
 * source class to the dependent class. In Java we can consider the dependency relationship if the
 * source class has a reference to the dependent class directly or source class has methods through
 * which the dependent objects are passed as a parameter or refers to the static operation’s of the
 * dependent class or source class has a local variable referring to the dependent class etc.
 * </p>
 * <p>
 * <img src="./dependency_example.gif" alt="Dependency Example" width="100%">
 * </p>
 */
package uml;