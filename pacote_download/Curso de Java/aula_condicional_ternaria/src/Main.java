import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double salario;
        double imposto = 0.00;

        System.out.print("Digite o seu salário: ");
        salario = scanner.nextDouble();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        }

        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        }

        else if (salario <= 4500.00) {
            imposto = (((salario - 2000.00) - 1000.00) * 0.18) + 1000.00 * 0.08;
        }

        else if (salario > 4500) {
            imposto = ((((salario - 2000.00) - 1000.00) - 1500.00) * 0.28) + (1000.00 * 0.08) + (1500.00 * 0.18);
        }

        System.out.printf("R$%.2f", imposto);

        scanner.close();
    }
}
