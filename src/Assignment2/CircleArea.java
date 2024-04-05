package Assignment2;
//Java program to find the area of circle.
import java.util.Scanner;
public class CircleArea {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle");
    double radius = sc.nextDouble();
    double Area;
    double pi = 3.14;
    Area = pi * radius;
        System.out.println("Area of circle is " + Area);
    }
}
