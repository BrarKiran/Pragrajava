package Methods;

public class RectPerimeter {
double length;
double width;
double perimeter;
    public double calculatePerimeter(double length, double width){
double perimeter =  2* (length +  width);
return perimeter;
    }
public static void main (String[]args){
        RectPerimeter rectange = new RectPerimeter();
        double Perimeter = rectange.calculatePerimeter(3,4);
    System.out.println("Perimeter of Methods.Constructors.Rectangle is " + Perimeter);

}
}