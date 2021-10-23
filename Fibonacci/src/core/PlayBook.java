package core;
import java.util.*;
public class PlayBook
{
    public static void main(String[]args)
    {
        System.out.println("Entrez le Nieme terme de la suite de fibonacci voulu: ");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        Fibonacci.fibonacci(number);
    }
}
