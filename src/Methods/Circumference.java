package Methods;

public class Circumference {
    double radius;
            double circumference;
    public double Circumference(double radius) {
        double pi = 3.14;
        double circumference = 2*pi*radius;
        return circumference;
    }
    public static void main (String[]args){
        Circumference circumference = new Circumference();
        double Circumference = circumference.Circumference(2);
        System.out.println("Methods.Circumference of Methods.Circle is " + Circumference);
    }
}
