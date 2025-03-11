import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n;
        int soma = 0;

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            n = scanner.nextInt();
            soma += n;
        }

        System.out.println(soma);

        scanner.close();
    }
}
