package application;

import entities.ContaBancaria;
import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta;

        System.out.print("Digite o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();

        System.out.print("Deseja iniciar um depósito de abertura (s/n)? " );
        char resposta = scanner.next().toLowerCase().charAt(0);

        if(resposta == 's') {
            System.out.print("Digite o valor do depósito inicial: ");
            double depositoInicial = scanner.nextDouble();
            conta = new ContaBancaria(numeroDaConta, depositoInicial, titular);
        }

        else {
            conta = new ContaBancaria(numeroDaConta, titular);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite um valor para depositar: ");
        double depositoValor = scanner.nextDouble();
        conta.deposito(depositoValor);
        System.out.println("Dados da conta autalizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Digite o valor de saque: ");
        double saqueValor = scanner.nextDouble();
        conta.saque(saqueValor);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        scanner.close();
    }
}
