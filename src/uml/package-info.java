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
 * <img src="./multiplicity_example.gif" alt="Multiplicity Example" width="100%">
 * </p>
 *
 * <h2>Generalization Example</h2>
 * <p>
 * <img src="./generalization_example.gif" alt="Generalization Example" width="100%">
 * </p>
 *
 * <h2>Realization Example</h2>
 * <p>
 * <img src="./realization_example.gif" alt="Realization Example" width="100%">
 * </p>
 */
package uml;