package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        String[] pessoas = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        double soma, media, menor, porcent;
        soma = 0.0;
        menor = 0.0;

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa:%n", i);

            System.out.print("Nome: ");
            pessoas[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
            scanner.nextLine();

            if(idades[i] < 16){
                menor++;
            }

            soma += alturas[i];
        }

        porcent = menor * 100.0 / n;

        media = soma / n;

        System.out.printf("Altura média: %.2f%n", media);

        System.out.printf("Pessoas com menos de 16 anos: %.2f", porcent);

        scanner.close();
    }
}
