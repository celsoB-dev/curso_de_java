import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        double soma = 0;

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        System.out.print("Valores: ");

        for(int i = 0; i < n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.println();

        System.out.printf("Soma: %.2f%n", soma);

        double media = soma / n;

        System.out.printf("Média: %.2f",media);

        scanner.close();
    }
}
