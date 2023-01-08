import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered marks.
        Scanner scanner = new Scanner(System.in);

        // Stores the marks of 5 students.
        int[] marks = new int[5];

        // Scans the marks.
        marks[0] = scanner.nextInt();
        marks[1] = scanner.nextInt();
        marks[2] = scanner.nextInt();
        marks[3] = scanner.nextInt();
        marks[4] = scanner.nextInt();

        // Prints the marks of 4th student.
        System.out.println(marks[4]);
    }
}