package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            vect[i] = new Product();
            System.out.printf("Rent #%d%n", i+1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room ");
            int room = scanner.nextInt();
            scanner.nextLine();
            vect[i] = vect[room];
            vect[i] = new Product(name, email, room);
        }

        System.out.println("Busy rooms: \n");

        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.printf("%d: %s, %s%n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
            }
        }

        scanner.close();
    }
}
