import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter student marks (0 to 100): ");
        int marks = sc.nextInt();

        // Grade calculation using if-else
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } 
        else if (marks >= 80) {
            System.out.println("Grade: B");
        } 
        else if (marks >= 70) {
            System.out.println("Grade: C");
        } 
        else if (marks >= 60) {
            System.out.println("Grade: D");
        } 
        else if (marks >= 40) {
            System.out.println("Grade: E");
        } 
        else if (marks >= 0) {
            System.out.println("Grade: F (Fail)");
        } 
        else {
            System.out.println("Invalid marks entered");
        }

        // Close scanner
        sc.close();
    }
}
