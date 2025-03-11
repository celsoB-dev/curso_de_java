import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o valor de x e y: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (y == 0){
            System.out.println("Eixo y");
        }

        else if (x == 0) {
            System.out.println("Eixo x");
        }

        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }

        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }

        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }

        else {
            System.out.println("Q4");
        }
        

        scanner.close();
    }
}