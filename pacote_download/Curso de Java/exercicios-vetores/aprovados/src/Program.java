import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];
        double[] media = new double[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %d aluno:%n", i+1);
            nome[i] = scanner.nextLine();

            nota1[i] = scanner.nextDouble();
            scanner.nextLine();

            nota2[i] = scanner.nextDouble();
            scanner.nextLine();

            media[i] = nota1[i] + nota2[i] / n;
        }

        System.out.println("Alunos aprovados:");

        for(int i = 0; i < n; i++){
            if(media[i] >= 6.0){
                System.out.println(nome[i]);
            }
        }

        scanner.close();
    }
}
