import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        double somaPares = 0.0;
        double numerosPares = 0.0;

        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = scanner.nextInt();

            if(numeros[i] % 2 == 0){
                somaPares += numeros[i];
                numerosPares++;
            }
        }

        if(numerosPares > 0){
            double media = somaPares / numerosPares;
            System.out.printf("%nMEDIA DOS PARES = %.1f%n", media);
        }

        else{
            System.out.printf("%nNENHUM NUMERO PAR%n");
        }

        scanner.close();
    }
}
