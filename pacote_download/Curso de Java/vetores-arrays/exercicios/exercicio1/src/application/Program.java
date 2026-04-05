package application;

import entities.Product;
import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product[] rooms = new Product[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){
            System.out.printf("Rent #%d%n", i+1);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Room: ");
            int nroom = sc.nextInt();
            sc.nextLine();

            rooms[nroom] = new Product(name, email);
        }
        System.out.println();

        System.out.println("Busy rooms:");

        for (int i = 0; i < rooms.length; i++){
            if(rooms[i] != null){
                System.out.printf("%d: %s, %s%n", i, rooms[i].getNome(), rooms[i].getEmail());
            }
        }

        sc.close();
    }

}
