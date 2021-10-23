package core;

public class SwapNumbers
{
    public static void swap(int x,int y)
    {
        System.out.println("before swapping numbers: "+x +" and "+ y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: "+x +" and " + y);
    }
}
