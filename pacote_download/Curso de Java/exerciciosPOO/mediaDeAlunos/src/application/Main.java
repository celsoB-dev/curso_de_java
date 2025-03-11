package application;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.name = scanner.nextLine();

        student.grade1 = scanner.nextDouble();

        student.grade2 = scanner.nextDouble();

        student.grade3 = scanner.nextDouble();

        System.out.println();
        System.out.println(student);
        student.condition();

        scanner.close();
    }
}
