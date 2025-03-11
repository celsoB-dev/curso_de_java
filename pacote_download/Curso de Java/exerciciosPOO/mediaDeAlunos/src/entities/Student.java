package entities;

public class Student {

    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    public void condition() {

        double missing = 60.00 - finalGrade();

        if (finalGrade() >= 60.00) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", missing);
        }
    }

    public String toString() {
        return "FINAL GRADE: " + String.format("%.2f", finalGrade());
    }
}
