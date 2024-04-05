package Assignment1;

import java.util.Scanner;
//Java program that checks a student's grade based on their score.
public class Grades {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks");
    double Marks = sc.nextDouble();
if (Marks>=90) {
    System.out.println("Grade A");
}
else if (Marks>=80 && Marks<90) {
            System.out.println("Grade B");
        }
else if (Marks >=70 && Marks<80) {
    System.out.println("Grade C");
}
    else if (Marks>=60 && Marks<70) {
    System.out.println("Grade D");
    }
    else {
    System.out.println("Grade E");
    }


    }
}