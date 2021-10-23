package core;
import java.util.*;
public class PlayBook
{
    public static void main(String[]args)
    {
    int num;
    Scanner sc= new Scanner(System.in);
System.out.print("Enter the limit: ");
//reads the limit from the user
    num=sc.nextInt();
System.out.println("Armstrong Number up to "+ num + " are: ");
for(int i=0; i<=num; i++)
//function calling
        if(Armstrong.isArmstrong(i))
//prints the armstrong numbers
        System.out.print(i+ ", ");
    }
}
