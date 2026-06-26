import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   STUDENT GRADE CALCULATOR");
        System.out.println("=================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

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

        int total = java + dbms + dsa + os + cn;

        double percentage = total / 5.0;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("\n========== RESULT ==========");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage);
        System.out.println("Grade        : " + grade);
    }
}