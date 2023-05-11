import  java.util.Scanner;
public class RectangleArea {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Please enter the length:");
        double l= s.nextDouble();
        System.out.println("Please enter the width:");
        double w= s.nextDouble();


        double  area=l*w;
        System.out.println("Area of Rectangle is: " + area);
    }
}
