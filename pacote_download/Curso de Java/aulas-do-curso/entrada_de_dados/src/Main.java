import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        String x;
        int y;
        double z;

        //System.out.print("Digite um caractere: ");
        //x = scanner.next().charAt(0);   // Lê apenas o primeiro caractere da string

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();

        System.out.printf("x = %s, y = %d, %.2f\n", x, y, z);

        scanner.close();
    }
}
