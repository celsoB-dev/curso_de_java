import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite os valores do vetor A:");
            vetorA[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println("Digite os valores do vetor B:");
            vetorB[i] = scanner.nextInt();
        }

        for(int i = 0; i < n;)

        scanner.close();
    }
}
