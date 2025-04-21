import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = scanner.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];

        double mediaMulheres;
        double somaMulheres = 0.0;
        int numHomens = 0;
        int numMulheres = 0;

        for(int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            altura[i] = scanner.nextDouble();
            scanner.nextLine();

            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = scanner.nextLine().charAt(0);

            if(genero[i] == 'F'){
                somaMulheres += altura[i];
                numMulheres++;
            }
            else if(genero[i] == 'M'){
                numHomens++;
            }
        }

        mediaMulheres = somaMulheres / numMulheres;

        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        for(int i = 0; i < n; i++){
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altua = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", mediaMulheres);
        System.out.printf("Número de homens = %d%n", numHomens);

        scanner.close();
    }
}
