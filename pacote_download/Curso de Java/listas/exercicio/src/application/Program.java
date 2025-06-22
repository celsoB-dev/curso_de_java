package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        List<Integer> ids = new ArrayList<>();
        List<String> names = new ArrayList<>();
        List<Double> salaries = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int number = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[number];

        for (int i = 0; i < number; i++){

            System.out.printf("Employee %d:%n", i+1);

            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(id, name, salary);

        }

        scanner.close();
    }
}
