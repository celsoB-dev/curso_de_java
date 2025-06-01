package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        int x = 20;

        Object obj = x;     //Boxing

        System.out.println(obj);

        int y = (int) obj;  //Unboxing

        System.out.println(y);

        int z = 30;

        Integer obj2 = z;   //Wrapper Class

        int w = obj2;

        System.out.println(obj2);

        scanner.close();
    }
}
