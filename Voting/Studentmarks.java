import java.util.*;

public class Studentmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        boolean isPromoted = false;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            int marks = sc.nextInt();
            
            if (marks >= 35) {
                result += marks;   
            } else {
                isPromoted = true;   
                break;               
            }
        }

        if (isPromoted) {
            System.out.println("Promoted");
        } else {
            int percentage = (result * 100) / 500;
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
                grade = "Promoted";
            }

            System.out.println("Total Marks: " + result);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }

    }   
}