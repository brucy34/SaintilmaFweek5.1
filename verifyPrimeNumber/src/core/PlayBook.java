package core;
import java.util.*;
public class PlayBook
{
    public static  void main(String[]args)
    {
        System.out.println("Veuillez entrer votre nombre:");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        PrimeNumber.verifyIsPrime(number);
    }
}
