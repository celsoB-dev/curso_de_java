package application;

import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        //Criação de sobrecarga para dar mais opções de instanciamento

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product p = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("The number of products to be added in stock: ");
        int quantity = scanner.nextInt();

        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();

        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
