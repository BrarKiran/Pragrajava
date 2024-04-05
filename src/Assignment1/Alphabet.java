package Assignment1;
// Java program that takes a character as input and determines if it's a vowel or a consonant.
import java.util.Scanner;

public class Alphabet {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        char Input = sc.next().charAt(0);
        if (Input == 'a' ||  Input =='e' || Input == 'i' || Input == 'o' || Input == 'u' ||
                Input == 'A' ||  Input =='E' || Input == 'I' || Input == 'O' || Input == 'U')

        {
            System.out.println("Input is vowel");
        }
        else {
            System.out.println("Input is consonent");
        }



    }
}
