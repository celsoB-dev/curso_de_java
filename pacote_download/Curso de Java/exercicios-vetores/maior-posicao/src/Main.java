import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        for(int i  = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }

        double maiorNumero = 0;
        int posicao = -1;

        for(int i = 0; i < n; i++){
            if(vetor[i] > maiorNumero){
                maiorNumero = vetor[i];
                posicao++;
            }
        }

        System.out.println("\nMAIOR VALOR = " + maiorNumero);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);

        scanner.close();
    }
}
