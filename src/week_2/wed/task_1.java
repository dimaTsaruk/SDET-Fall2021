package week_2.wed;

import java.util.Scanner;

public class task_1 {
    /*Write a Java program to print the area and perimeter of a rectangle.
    The width and height should be entered from
    Test Data:
    Note: The width and height should be entered by keyboard.
            Width = 5.6 Height = 8.5
    Expected Output
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20  */

    public static void main(String[] args) {

        // scanner object allows us to enter data from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the width of a rectangle: ");

        // nextDouble() method called from scanner object allows us to hold and store double values
        double w = scanner.nextDouble();
        System.out.println("Please, enter the height of a rectangle: ");
        double h = scanner.nextDouble();
        double area = w * h;
        double perim = 2 * (w + h);

        // (%.1f) and (%.2f) means that passed argument (f) has a data type with float point (double and float)
        // numbers tell to compiler how many digits we want to see after period
        System.out.printf("Area is %.1f * %.1f = %.2f", w, h, area);                // %.1f = one digit after comma
        System.out.printf("\nPerimeter is 2 * (%.1f + %.1f) = %.2f", w, h, perim);  // %.2f = two digits after comma


    }
}

