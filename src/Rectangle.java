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

}
