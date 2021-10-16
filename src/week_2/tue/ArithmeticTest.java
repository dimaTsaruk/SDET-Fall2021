package week_2.tue;

public class ArithmeticTest {

    // Save as "ArithmeticTest.java"
    // Declare an int variable number1 and initialize it to 98
    // Declare an int variable number2 and initialize it to 5
    //? sum, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
    // Perform arithmetic Operations
    public static void main(String[] args) {

        int number1 = 98, number2 = 5;

        int sum = number1 + number2;
        int dif = number1 - number2;
        int prod = number1 * number2;
        int div = number1 / number2;
        int rem = number1 % number2;

        // Print results
        // Print description
        System.out.print("The sum, difference, product," +
                " division and remainder of 98 and 5 are");
        System.out.printf("\nSum: %s\nDifference: %s\nProduct: %s\nDivision: %s\nRemainder: %s",
                sum, dif, prod, div, rem);
    }
}

    /* The result should be:
    The sum, difference, product, division and remainder of 98 and 5 are
    Sum: 103
    Difference: 93
    Product: 490
    Division: 19
    Remainder: 3*/


