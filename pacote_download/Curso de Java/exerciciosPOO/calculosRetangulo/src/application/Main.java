package application;

import entities.Rectangle;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        x.width = scanner.nextDouble();
        x.height = scanner.nextDouble();

        System.out.printf("Area: %.2f%n", x.area());
        System.out.printf("Perimeter: %.2f%n", x.perimeter());
        System.out.printf("Diagonal: %.2f%n", x.diagonal());

        scanner.close();
    }
}
