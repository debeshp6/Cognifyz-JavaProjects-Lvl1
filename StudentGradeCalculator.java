import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Grades: ");
        int numGrades = scanner.nextInt();

        int[] grades = new int[numGrades];

        for(int i = 0; i < numGrades; i++) {
            System.out.print("Enter the Grades: " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();

        }

        scanner.close();

        int total = 0;
        for(int i = 0; i < numGrades; i++) {
            total += grades[i];
        }

        double average = (double) total / numGrades;

        System.out.println("Average Grade is: " + average);
    }
}
