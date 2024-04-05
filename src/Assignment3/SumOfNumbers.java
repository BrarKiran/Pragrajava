package Assignment3;
//java program to find the sum of first n natural numbers
import java.util.Scanner;
public class SumOfNumbers {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N");
        int N = sc.nextInt();
        int i;
        int sum;
        sum = 0;
        for (i=1; i<=N;i++) {
            sum = sum +i;
        }
            System.out.println("Sum of first N natural numbers is " + sum);
    }
}
