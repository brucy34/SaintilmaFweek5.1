package core;
import java.util.*;
public class PlayBook
{
    public static void main(String[] args)
    {
        System.out.println("Enter the value of x and y");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        SwapNumbers.swap(x,y);
    }
}
