import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (String obj : vect){
            System.out.println(obj);
        }

        scanner.close();
    }
}
