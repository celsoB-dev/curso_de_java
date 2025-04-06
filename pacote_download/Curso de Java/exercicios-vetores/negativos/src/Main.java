import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você deseja digitar? ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        System.out.println();

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println();

        System.out.println("NÚMEROS NEGATIVOS:");

        for(int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        scanner.close();
    }
}
