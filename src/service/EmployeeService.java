package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Employee;

public class EmployeeService {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Enter Employee Id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Enter the department");
        String department = sc.nextLine();
        System.out.println("Enter the Salary:");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Email:");
        String email = sc.nextLine();
        Employee emp = new Employee(id, name, department, salary, email);
        employees.add(emp);
        System.out.println("Employee Added Successfully!");
    }

    public void viewEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No Employee Found!");
            return;
        }
        for (Employee emp : employees) {
            System.out.println(emp);

        }
    }

    public void searchEmployeebyId() {
        System.out.println("Enter Employee Id to search");
        int id = sc.nextInt();
        for (Employee emp : employees) {
            if (emp.getemployeeId() == id) {
                System.out.println("Employee Found:");
                System.out.println(emp);
                return;
            }
        }
        System.out.println("Employee not found");
    }

    public void updateEmployee() {
        System.out.println("Enter Employee ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {
            if (emp.getemployeeId() == id) {

                System.out.println("Enter new name:");
                String name = sc.nextLine();

                System.out.println("Enter new department:");
                String department = sc.nextLine();

                System.out.println("Enter new salary:");
                double salary = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter new email:");
                String email = sc.nextLine();

                emp.setemployeeName(name);
                emp.setdepartment(department);
                emp.setsalary(salary);
                emp.setemail(email);

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void deleteEmployee() {
        System.out.println("Enter Employee ID to delete:");
        int id = sc.nextInt();

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getemployeeId() == id) {
                employees.remove(i);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

}