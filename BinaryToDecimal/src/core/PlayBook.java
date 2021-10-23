package core;
import java.util.*;
public class PlayBook
{
    public  static void main(String[]args)
    {
        System.out.println("Entrez le nombre binaire:");
        Scanner scan=new Scanner(System.in);
        String binaryString=scan.nextLine();
        int decimal=Integer.parseInt(binaryString,2);
        System.out.println("Le nombre decimal correspondant est:");
        System.out.println(decimal);
    }
}
