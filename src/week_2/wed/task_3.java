package week_2.wed;

public class task_3 {
   /* Write a Java program and compute the sum of the digits of an integer.
    Hint: to find the remainder in this example last digit you should use % symbol
    to find the first digit you should use / symbol.
    Input Data:
    Input an integer: 25
    Expected Output. : The sum of the digits is: 7 */


    public static void main(String[] args) {

        int number = 25;
        int sum = 0;

        while (true) {  // stops when command "break" executes
            if (number == 0) {
                System.out.println("The sum of digits is: " + sum);
                break;  // stop program execution
            } else {
                int lastDigit = number % 10;     // return last digit
                int remainDigits = number / 10; // return updated number without last digit
                sum = sum + lastDigit;         // put last digit into "sum" variable
                number = remainDigits;        // delete last digit from number
            }
        }

    }
//        numSum(25);
//    }
//    static void numSum(int n)
//    {
//        int sum = 0;
//        while (n != 0)
//        {
//            sum = sum + n % 10;
//            n = n/10;
//        }
//        System.out.println(sum);
//    }
}
