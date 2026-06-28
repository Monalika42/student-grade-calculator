import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("       STUDENT GRADE CALCULATOR");
        System.out.println("=========================================");

        // Student Name
        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        // Subject Marks
        System.out.print("Enter Java Marks : ");
        int java = sc.nextInt();

        System.out.print("Enter DBMS Marks : ");
        int dbms = sc.nextInt();

        System.out.print("Enter DSA Marks : ");
        int dsa = sc.nextInt();

        System.out.print("Enter OS Marks : ");
        int os = sc.nextInt();

        System.out.print("Enter CN Marks : ");
        int cn = sc.nextInt();

        // Calling Methods
        int total = calculateTotal(java, dbms, dsa, os, cn);

        double average = calculateAverage(total);

        double percentage = calculatePercentage(total);

        int highest = findHighest(java, dbms, dsa, os, cn);

        int lowest = findLowest(java, dbms, dsa, os, cn);

        String grade = calculateGrade(percentage);

        String result = calculateResult(java, dbms, dsa, os, cn);

        String remark = calculateRemark(percentage);

        displayReport(
                name,
                java,
                dbms,
                dsa,
                os,
                cn,
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
    public static int calculateTotal(int java, int dbms, int dsa, int os, int cn) {

        return java + dbms + dsa + os + cn;

    }

    // Calculate Average
    public static double calculateAverage(int total) {

        return total / 5.0;

    }

    // Calculate Percentage
    public static double calculatePercentage(int total) {

        return total / 5.0;

    }

    // Find Highest
    public static int findHighest(int java, int dbms, int dsa, int os, int cn) {

        int highest = java;

        if (dbms > highest)
            highest = dbms;

        if (dsa > highest)
            highest = dsa;

        if (os > highest)
            highest = os;

        if (cn > highest)
            highest = cn;

        return highest;

    }

    // Find Lowest
    public static int findLowest(int java, int dbms, int dsa, int os, int cn) {

        int lowest = java;

        if (dbms < lowest)
            lowest = dbms;

        if (dsa < lowest)
            lowest = dsa;

        if (os < lowest)
            lowest = os;

        if (cn < lowest)
            lowest = cn;

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

        else
            return "Fail";

    }

    // Calculate Result
    public static String calculateResult(int java, int dbms, int dsa, int os, int cn) {

        if (java >= 35 &&
                dbms >= 35 &&
                dsa >= 35 &&
                os >= 35 &&
                cn >= 35)

            return "PASS";

        else

            return "FAIL";

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

        else if (percentage >= 35)
            return "Needs Improvement";

        else
            return "Fail";

    }

    // Display Report
    public static void displayReport(
            String name,
            int java,
            int dbms,
            int dsa,
            int os,
            int cn,
            int total,
            double average,
            double percentage,
            int highest,
            int lowest,
            String grade,
            String result,
            String remark) {

        System.out.println();

        System.out.println("=========================================");
        System.out.println("           STUDENT REPORT");
        System.out.println("=========================================");

        System.out.println("Student Name : " + name);

        System.out.println("-----------------------------------------");

        System.out.println("Java Marks   : " + java);
        System.out.println("DBMS Marks   : " + dbms);
        System.out.println("DSA Marks    : " + dsa);
        System.out.println("OS Marks     : " + os);
        System.out.println("CN Marks     : " + cn);

        System.out.println("-----------------------------------------");

        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Percentage   : " + percentage);

        System.out.println("-----------------------------------------");

        System.out.println("Highest Mark : " + highest);
        System.out.println("Lowest Mark  : " + lowest);

        System.out.println("-----------------------------------------");

        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);
        System.out.println("Remark       : " + remark);

        System.out.println("=========================================");
    }
}