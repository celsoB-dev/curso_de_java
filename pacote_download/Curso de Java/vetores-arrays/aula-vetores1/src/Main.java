import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){

        //Vetor com elementos do tipo valor

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            vect[i] = scanner.nextDouble();
        }
        double sum = 0.0;
        for(int j = 0; j < n; j++){
            sum += vect[j];
        }
        double media = sum /n;

        System.out.printf("%nAverage height %.2f%n", media);

        scanner.close();
    }
}
