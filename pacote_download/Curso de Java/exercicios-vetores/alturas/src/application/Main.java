package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        Pessoas[] vetor = new Pessoas[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Digite o nome da %da pessoa: ", i);

        }

        scanner.close();
    }
}
