package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Name: ");
        funcionario.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        funcionario.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println("Emplyee: " + funcionario);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        percentage /= 100;

        funcionario.increaseSalary(percentage);

        System.out.println("Updated data: " + funcionario);

        scanner.close();
    }
}
