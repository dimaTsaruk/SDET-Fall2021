package week_2;

public class task_1 {
     /*
Write a Java program that has two integers number1 and number2
prints the sum, the difference, the product.
number1: 25
number2: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
    */

    public static void main(String[] args) {
        int n1 = 25, n2 = 5;
        sum(n1, n2);
        difference(n1, n2);
        product(n1, n2);
    }

    private static void difference(int n1, int n2) {
        System.out.println("Difference of two integers: " + (n1 - n2));
    }
    private static void sum(int n1, int n2) {
        System.out.println("Sum of two integers: " + (n1 + n2));
    }
    private static void product(int n1, int n2) {
        System.out.println("Product of two integers: " + (n1 * n2));
    }
}

