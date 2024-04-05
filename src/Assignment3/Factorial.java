package Assignment3;
// java program to find the factorial of a given number using a while loop.
import java.util.Scanner;
public class Factorial {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N to get Factorial");
        int N = sc.nextInt();
               int Factorial;
        Factorial = 1;
        for (int i=1; i<=N; i++){
            Factorial = Factorial * i;
        }
        System.out.println("Factorial of i is " + Factorial);


    }

}
