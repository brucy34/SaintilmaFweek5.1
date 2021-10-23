package core;

public class PlayBook
{
    public static void main(String[]args)
    {
        int num = 12345;
        int result = SumOfDigits.sum_of_digit(num);
        System.out.println("Sum of digits in " +
                num + " is " + result);
    }
}
