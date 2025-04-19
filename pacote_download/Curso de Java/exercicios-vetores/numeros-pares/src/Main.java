import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int contadorPar = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        int[] vetor = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();

            if(vetor[i] % 2 == 0){
                contadorPar++;
            }
        }

        System.out.println();

        System.out.println("NÚMEROS PARES: ");

        for(int i = 0; i < n; i++){
            if(vetor[i] %  2 ==0){
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println();

        System.out.println("QUANTIDADE DE PARES: " + contadorPar);

        scanner.close();
    }
}
