package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] rooms = new Product[10];

        for (int i = 1; i <= n; i++) {
            System.out.printf("Rent #%d%n", i);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Room: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            Product rent = new Product(name, email);

            rooms[num] = rent;
        }

        System.out.println("\nBusy rooms: ");

        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.printf("%d: %s%n", i, rooms[i]);
            }
        }
        scanner.close();
    }
}
