package application;

import entities.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria usuario = new ContaBancaria();

        System.out.print("Digite o nome do titular: ");
        usuario.titular = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        usuario.numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        usuario.saldo = scanner.nextDouble();

        System.out.println(usuario);

        System.out.println();
        System.out.print("Digite o valor que deseja depositar: ");
        double valor = scanner.nextDouble();

        usuario.depositar(valor);

        System.out.println("Após depósito: " + usuario);

        System.out.println();
        System.out.print("Digite o valor que deseja sacar: ");
        valor = scanner.nextDouble();

        usuario.sacar(valor);

        System.out.println();

        System.out.println("Após saque: " + usuario);



        scanner.close();
    }
}
