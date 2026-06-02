package com.employeecrud.main;

import com.employeecrud.dao.EmployeeDAO;
import com.employeecrud.model.Employee;

import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n===== Employee CRUD =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee emp =
                            new Employee(name, department, salary);

                    dao.addEmployee(emp);

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDept = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    double newSalary = sc.nextDouble();

                    dao.updateEmployee(
                            updateId,
                            newName,
                            newDept,
                            newSalary
                    );

                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 5:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}