package application;

import entities.AdminAndService;
import entities.Employee;
import entities.Professor;

import java.util.ArrayList;
import java.util.List;

public class University {

    static List<Employee> list = new ArrayList<>();

    public static void printPayroll(List<Employee> employeeLis){

        for (Employee emp : employeeLis){
            System.out.printf("Name: %s - Position: %s - Payment: €%.2f%n", emp.getName(), emp.getPosition(), emp.payment());
        }
    }
    public static void totalBudget(List<Employee> employeeLis){
        double budget = 0.0;

        for (Employee emp : employeeLis){
            budget += emp.payment();
        }
        System.out.printf("Budget: €%.2f", budget);
    }

    public static void main(String[] args) {

        Employee employee = new Employee("James Jarv","Investigador", 35, 7.0);
        list.add(employee);
        Professor professor = new Professor("Maria Grey", "Professora", 37, 8.0);
        list.add(professor);
        AdminAndService admin = new AdminAndService("Alex Silva", "Administrativo", 37, 7.5, 5.0);
        list.add(admin);
        AdminAndService tec = new AdminAndService("Bob Green", "Informático", 40, 6.0, 10.0);
        list.add(tec);

        System.out.println("University staff list:");
        University.printPayroll(list);

        System.out.println("\nTotal amount spent on employees.:");
        University.totalBudget(list);

    }
}


