package principal;

import java.util.Scanner;
import matematica.Soma;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Soma x;
        int soma;

        x = new Soma();

        System.out.print("Digite n1 e n2: ");
        x.num1 = scanner.nextInt();
        x.num2 = scanner.nextInt();

        soma = x.soma();

        System.out.printf("%d + %d = %d", x.num1, x.num2, soma);

    }
}
