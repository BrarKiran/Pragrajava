package Constructors;

public class Rectangle {
    double length;
    double width;

    public double calculateArea(double length, double width){
        double Area = length * width;
        return Area;
    }
    public double calculatePerimeter(double length, double width){
        double Peri = 2*(length + width);
        return Peri;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        double kb =rect.calculateArea(3,4);
        System.out.println("Area is " + kb );
        System.out.println("Peri is " + rect.calculatePerimeter(3,4));

        double kb1 =rect.calculateArea(2,4);
        System.out.println("Area is " + kb1 );
        System.out.println("Peri is " + rect.calculatePerimeter(2,4));

    }
}
