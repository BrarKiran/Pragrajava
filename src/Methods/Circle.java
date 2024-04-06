package Methods;

public class Circle {
    double radius;
    double area;
    public double Area (double radius) {
         double pi = 3.14;
       double area= pi * radius;
        return area;
    }
      public static void main(String[]args){
        Circle area = new Circle();
        double areaOfCircle = area.Area(2);
                System.out.println("Area of circle is " + areaOfCircle);
        }

    }

