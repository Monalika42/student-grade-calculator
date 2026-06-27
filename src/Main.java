import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("      STUDENT GRADE CALCULATOR");
        System.out.println("=========================================");

        // Student Name
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        // Subject Marks
        System.out.print("Enter Java Marks: ");
        int java = sc.nextInt();

        System.out.print("Enter DBMS Marks: ");
        int dbms = sc.nextInt();

        System.out.print("Enter DSA Marks: ");
        int dsa = sc.nextInt();

        System.out.print("Enter Operating System Marks: ");
        int os = sc.nextInt();

        System.out.print("Enter Computer Networks Marks: ");
        int cn = sc.nextInt();

        // Total
        int total = java + dbms + dsa + os + cn;

        // Average
        double average = total / 5.0;

        // Percentage
        double percentage = total / 5.0;

        // Highest
        int highest = java;

        if (dbms > highest)
            highest = dbms;

        if (dsa > highest)
            highest = dsa;

        if (os > highest)
            highest = os;

        if (cn > highest)
            highest = cn;

        // Lowest
        int lowest = java;

        if (dbms < lowest)
            lowest = dbms;

        if (dsa < lowest)
            lowest = dsa;

        if (os < lowest)
            lowest = os;

        if (cn < lowest)
            lowest = cn;

        // Grade
        String grade;

        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "Fail";

        // Result
        String result;

        if (java >= 35 &&
                dbms >= 35 &&
                dsa >= 35 &&
                os >= 35 &&
                cn >= 35) {

            result = "PASS";

        } else {

            result = "FAIL";

        }

        // Remark
        String remark;

        if (percentage >= 90)
            remark = "Excellent";
        else if (percentage >= 80)
            remark = "Very Good";
        else if (percentage >= 70)
            remark = "Good";
        else if (percentage >= 60)
            remark = "Average";
        else if (percentage >= 35)
            remark = "Needs Improvement";
        else
            remark = "Fail";

        // Output
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

        sc.close();
    }
}