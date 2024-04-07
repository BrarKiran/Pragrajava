package Methods;

public class Rectangle {
    double length;
    double width;
    double area;
        public double calculateAreaOfRectangle(double length, double width) {
      double area = length * width;
      return area;
    }
    public static void main(String[]args){
            Rectangle rectangle = new Rectangle();
            double AreaOfRectangle = rectangle.calculateAreaOfRectangle(9,5);
        System.out.println("Area of Methods.Constructors.Rectangle is " + AreaOfRectangle);
    }



    }
