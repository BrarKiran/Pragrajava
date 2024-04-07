package Assignment3;

import java.util.Scanner;

//Java program that uses a do-while loop to continuously prompt the user for input until they enter 'q' to quit.
public class DoWhile {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char");
        char ch = scanner.next().charAt(0);

        do {
            System.out.println("Enter character");
        }
        while (ch != 'q');
    }
}
