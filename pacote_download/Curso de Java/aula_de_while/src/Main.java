import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int num;
        int soma = 0;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();

        while (num != 0) {

            soma += num;
            System.out.print("Digite um número: ");
            num = scanner.nextInt();

        }

        System.out.println("\nSoma: " + soma);

        scanner.close();
    }
}