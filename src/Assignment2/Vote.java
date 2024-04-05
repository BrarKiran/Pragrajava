package Assignment2;
//Java program that takes a user's age as input and determines whether they are eligible to vote or not.
import java.util.Scanner;
public class Vote {
    public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of voter");
     int age = sc.nextInt();
if (age>=18){
    System.out.println("Voter eligible to vote");
}
else{
    System.out.println("Not eligible to vote");
}
    }
}
