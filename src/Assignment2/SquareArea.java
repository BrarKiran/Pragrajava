package Assignment2;
//Java program to find the area of square.
import java.util.Scanner;
public class SquareArea {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side of square");
        double side = sc.nextDouble();
        double area;
        area = side * side;
        System.out.println("Area of squrae is " + area);

    }
}
