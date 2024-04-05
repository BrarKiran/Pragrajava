package Assignment1;
// Java  program that simulates a traffic light. The user can input a color (red, yellow, or green),
// and the program should output the action based on the traffic light color (stop, prepare to stop, go).

import java.util.Scanner;
public class TrafficLight {
    public static void main (String[]args){
    Scanner Input = new Scanner(System.in);
      System.out.println("Enter the color");
        String color = Input.next();
    switch (color) {
        case "Red":
            System.out.println("Stop");
            break;
        case "Yellow":
            System.out.println("Prepare to stop");
            break;
        case "Green":
            System.out.println("Go");
            break;

    }

    }
}
