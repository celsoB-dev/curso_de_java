package application;

import entities.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        double dollar = scanner.nextDouble();

        System.out.print("How many dollars will be bought?: ");
        double real = scanner.nextDouble();

        double conversor = CurrencyConverter.dollarConverter(dollar, real);

        System.out.printf("Amount to be paid in reais = R$%.2f%n", conversor);

        scanner.close();
    }
}
