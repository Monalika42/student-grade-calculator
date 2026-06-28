import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("====================================");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        String[] subjects = {
                "Java",
                "DBMS",
                "DSA",
                "OS",
                "CN"
        };

        int[] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {

            System.out.print("Enter " + subjects[i] + " Marks : ");
            marks[i] = sc.nextInt();

        }

        int total = calculateTotal(marks);

        double average = calculateAverage(total, marks.length);

        double percentage = calculatePercentage(total, marks.length);

        int highest = findHighest(marks);

        int lowest = findLowest(marks);

        String grade = calculateGrade(percentage);

        String result = calculateResult(marks);

        String remark = calculateRemark(percentage);

        displayReport(
                name,
                subjects,
                marks,
                total,
                average,
                percentage,
                highest,
                lowest,
                grade,
                result,
                remark
        );

        sc.close();

    }

    // Calculate Total
    public static int calculateTotal(int[] marks) {

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    // Calculate Average
    public static double calculateAverage(int total, int numberOfSubjects) {

        return (double) total / numberOfSubjects;

    }

    // Calculate Percentage
    public static double calculatePercentage(int total, int numberOfSubjects) {

        return (double) total / numberOfSubjects;

    }

    // Find Highest Mark
    public static int findHighest(int[] marks) {

        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

        }

        return highest;

    }

    // Find Lowest Mark
    public static int findLowest(int[] marks) {

        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

        }

        return lowest;

    }

    // Calculate Grade
    public static String calculateGrade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "Fail";

    }

    // Calculate Result
    public static String calculateResult(int[] marks) {

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 35) {
                return "FAIL";
            }

        }

        return "PASS";

    }

    // Calculate Remark
    public static String calculateRemark(double percentage) {

        if (percentage >= 90)
            return "Excellent";
        else if (percentage >= 80)
            return "Very Good";
        else if (percentage >= 70)
            return "Good";
        else if (percentage >= 60)
            return "Average";
        else if (percentage >= 50)
            return "Need Improvement";
        else
            return "Fail";

    }

    // Display Report
    public static void displayReport(
            String name,
            String[] subjects,
            int[] marks,
            int total,
            double average,
            double percentage,
            int highest,
            int lowest,
            String grade,
            String result,
            String remark) {

        System.out.println();
        System.out.println("========================================");
        System.out.println("         STUDENT REPORT");
        System.out.println("========================================");

        System.out.println("Student Name : " + name);

        System.out.println("----------------------------------------");

        // Display Subject Names and Marks
        for (int i = 0; i < subjects.length; i++) {

            System.out.printf("%-10s : %d%n", subjects[i], marks[i]);

        }

        System.out.println("----------------------------------------");

        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Percentage  : " + percentage);

        System.out.println("----------------------------------------");

        System.out.println("Highest Mark : " + highest);
        System.out.println("Lowest Mark  : " + lowest);

        System.out.println("----------------------------------------");

        System.out.println("Grade  : " + grade);
        System.out.println("Result : " + result);
        System.out.println("Remark : " + remark);

        System.out.println("========================================");
    }
}