public class RectangleMain {
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
