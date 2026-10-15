import java.util.Scanner;

class Employee {
    int id;
    String name, department, designation;
    double salary;

    Employee(int id, String name, String dept,
             String desig, double salary) {
        this.id = id;
        this.name = name;
        department = dept;
        designation = desig;
        this.salary = salary;
    }

    void display() {
        double hra = salary * 0.20;
        double da = salary * 0.10;
        double pf = salary * 0.12;
        double gross = salary + hra + da;
        double net = gross - pf;

        System.out.println("\n--- EMPLOYEE PAYROLL ---");
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.printf("Basic Salary: Rs. %.2f%n", salary);
        System.out.printf("HRA         : Rs. %.2f%n", hra);
        System.out.printf("DA          : Rs. %.2f%n", da);
        System.out.printf("Gross Salary: Rs. %.2f%n", gross);
        System.out.printf("PF          : Rs. %.2f%n", pf);
        System.out.printf("Net Salary  : Rs. %.2f%n", net);
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desig = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        if (salary >= 0) {
            Employee e = new Employee(id, name, dept, desig, salary);
            e.display();
        } else {
            System.out.println("Invalid Salary!");
        }

        sc.close();
    }
}
