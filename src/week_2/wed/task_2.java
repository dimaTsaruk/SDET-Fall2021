package week_2.wed;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class task_2 {
    /*Write a Java program to print the area and perimeter of a circle.
    Test Data:
    Note: The radius should be entered by keyboard.
            Formula: Perimeter=2*radius*3.14;            Area=3.14*radius*radius;
    Radius = 7.5
    Expected Output
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double PI = Math.PI;
        System.out.println("Enter radius value: ");
        double r = scanner.nextDouble();
        double perm = 2 * PI * r;
        double s = PI * r * r;

         //In case we need all digits after period we can use %s (s - means String,
        // but it's also works with different types (float , int , double...)
        System.out.printf("Perimeter is = %s", perm);
        System.out.printf("\nArea is = %s", s);

        /*
        If we know how many digits after period we need, we can use ( %.f)
        Next two lines have the same output as previous:
        System.out.printf("Perimeter is = %.14f", perm);
        System.out.printf("\nArea is = %.14f", s);
        */

    }
}
