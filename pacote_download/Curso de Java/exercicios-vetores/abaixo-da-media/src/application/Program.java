package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        double soma = 0.0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }

        double media = soma / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for(int i = 0; i < n; i++){
            if(numeros[i] < media){
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
