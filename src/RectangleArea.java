import java.util.Scanner;
public class RectangleArea {

    int a;
    int b;
    int c;
    public void getData() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("please, enter both sides of the rectangle");
        a = scaner.nextInt();
        b = scaner.nextInt();

        System.out.println("Sides of a Rectangle -- "+a + " " + b );
    }

    public void computeField(){
        c = a * b;

    }
    public void fieldDisplay(){
            System.out.println( "Rectangle area is -- " +c);
    }


}
