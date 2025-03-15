import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Enter three numbers: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        int higher = max(num1, num2, num3);

        showResult(higher);

        scanner.close();
    }

    public static int max (int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        }
        else if (y > x && y > z) {
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResult (int value) {
        System.out.println(value);
    }

}
