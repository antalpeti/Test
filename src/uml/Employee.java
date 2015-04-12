package uml;

public class Employee {
  private static String department = "R&D";
  private int empId;

  private Employee(int employeeId) {
    this.empId = employeeId;
  }

  public static String getEmployee(int emplId) {
    if (emplId == 1) {
      return "idiotechie";
    } else {
      return "Employee not found";
    }
  }

  public static String getDepartment() {
    return department;
  }
}
