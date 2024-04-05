package Assignment3;
//product table of a give number in specific format e.g. 5 * 1 = 5
public class Tables {
    public static void main (String[]args){
        System.out.println("Table of 5 is as written below");
        int N = 1;
        for (int i=1; i<=10; i++) {
            N = i * 5;
            System.out.println("5 * " + i + " = " + N);
        }
    }
}
