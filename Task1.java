import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter total marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter obtained marks: ");
        double obtainedMarks = scanner.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        double gpa;
        switch (grade) {
            case "A+":
                gpa = 4.0;
                break;
            case "A":
                gpa = 3.7;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.3;
                break;
            case "D":
                gpa = 1.7;
                break;
            default:
                gpa = 0.0;
        }

        System.out.println("\n--- Mark Sheet ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
    }
} 
