import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String id;
    private double salary;

    public Employee(String id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Salary: " + salary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        int numEmployees = 5;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            employees.add(new Employee(id, salary));
        }

        double highestSalary = 0;
        for (Employee emp : employees) {
            if (emp.getSalary() > highestSalary) {
                highestSalary = emp.getSalary();
            }
        }

        System.out.println("\nEmployees with the highest salary:");
        for (Employee emp : employees) {
            if (emp.getSalary() == highestSalary) {
                System.out.println(emp);
            }
        }

        scanner.close();
    }
}