// Input: Take marks obtained (out of 100) in each subject.
// Calculate Total Marks: Sum up the marks obtained in all subjects.
// Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
// average percentage.
// Grade Calculation: Assign grades based on the average percentage achieved.
// Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of subject: ");
        int allsub = sc.nextInt();

        System.out.println("Enter the subject mark out of 100.");
        float sum = 0;

        for (int i = 0; i < allsub; i++) {
            System.out.print("Enter the mark of Subject " + (i + 1) + ":");
            int topic = sc.nextInt();
            sum = sum + topic;
        }
        float AveragePercentage = (sum / allsub);

        System.out.println("Total marks are : " + sum);
        System.out.printf("You got : %.2f %%\n", AveragePercentage);

        switch ((int) AveragePercentage / 10) {
            case 10:
                System.out.println(" Grade : O.");
                break;
            case 9:
                System.out.println("Grade : A.");
                break;
            case 8:
                System.out.println("Grade : B.");
                break;
            case 7:
                System.out.println("Grade : C.");
                break;
            case 6:
                System.out.println("Grade is D.");
                break;
            case 5:
                System.out.println("Grade is E.");
                break;
            default:
                System.out.println("You are Fail.");
                break;
        }

    }
}
