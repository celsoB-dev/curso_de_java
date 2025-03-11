package application;


import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Main {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Enter the product data: ");

        System.out.print("Name: ");
        produto.name = scanner.nextLine();

        System.out.print("Price: ");
        produto.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        produto.quantity = scanner.nextInt();

        System.out.println();
        System.out.println(produto);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();

        produto.addProducts(quantity);

        System.out.println("Updated data: " + produto);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();

        produto.removeProducts(quantity);

        System.out.println("Updated data: " + produto);

        scanner.close();
    }
}
