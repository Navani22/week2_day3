import java.util.Scanner;

class Employee {
  int salary;
  String name;

  public int getSalary(int salary) {
    return salary;
  }

  public String getName(String name) {
    return name;
  }

  public String setName(String n1) {
    name = n1;
    return name;
  }
}

public class Practice1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name : ");
    String n = sc.next();
    System.out.println("Enter Salary  : ");
    int sal = sc.nextInt();
    Employee emp = new Employee();
    System.out.println("Salary of the employee " + emp.getName(n) + " is " + emp.getSalary(sal));
    System.out.println("Enter Name to change: ");
    String n1 = sc.next();
    String a = emp.setName(n1);
    System.out.println("Changed Name is " + a);
    sc.close();

  }

}