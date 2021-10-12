package week_2;

public class task_2 {
    /*
    Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6   // you should declare first data types ==> int
a=-5; int b=8; c=6 ; int result=a+b*c; System.out.println(result);
b. (55+9) % 9  // try to declare data type first and print out the result
c. 20 + -3*5 / 8  // try to declare data type first and print out the result
d. 5 + 15 / 3 * 2 - 8 % 3  // try to declare data type first and print
out the result
Expected Output :
43
1
19
//13
//    */

    public static void main(String[] args) {

        test_a(-5, 8, 6);
        test_b(55, 9);
        test_c(20, 3, 5, 8);
        test_d(5, 15, 3, 2, 8);

    }
    private static void test_a(int a, int b, int c) {
        int result = a + b * c;
        System.out.println(result);
    }
    private static void test_b(int a, int b) {
        int result = (a + b) % b;
        System.out.println(result);
    }
    private static void test_c(int a, int b, int c, int d) {
        int result = a + -b * c / d;
        System.out.println(result);
    }
    private static void test_d(int a, int b, int c, int d, int e) {
        int result = a + b / c * d - e % c;
        System.out.println(result);
    }
}
