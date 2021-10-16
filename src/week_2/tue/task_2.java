package week_2.tue;

public class task_2 {
    /* 2. Write a Java program to compute a specified formula.
            Specified Formula :
            4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        Expected Output
        2.9760461760461765*/
    public static void main(String[] args) {

        double d = 4.0;
        byte b = 1;
        double result = d * (b - (d/4)/(b+=2) + (d/4)/(b+=2) - (d/4)/(b+=2) + (d/4)/(b+=2) - (d/4)/(b+=2));
        System.out.print(result);

    }
}
