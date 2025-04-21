import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        String[] nomes = new String[n];
        int[] idade = new int[n];
        scanner.nextLine();

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %d pessoa:%n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int maisVelho = idade[0];

        for(int i = 0; i < n; i++){
            if(idade[i] > maisVelho){
                maisVelho = idade[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(idade[i] == maisVelho){
                System.out.println("PESSOA MAIS VELHA: " + nomes[i]);
            }
        }

        scanner.close();
    }
}
