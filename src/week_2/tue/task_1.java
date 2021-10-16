package week_2.tue;

public class task_1 {
    /*1. Write a Java program to compute the specified
    expressions and print the output.
            ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
        Expected Output


        Example: System.out.println(3.6+5.5)   the output is : 9.1 */

    public static void main(String[] args) {

        double d = 25.5, d1 = 3.5, d2 = 40.5, d3 = 4.5;
        double result = ((d * d1 - d1 * d1) / (d2 - d3));
        System.out.println(result);
    }
}
