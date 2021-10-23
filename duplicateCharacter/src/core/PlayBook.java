package core;
import java.util.Scanner;
public class PlayBook
{
    public static void main(String[]args)
    {
        System.out.println("Enter your string: ");
        Scanner scan = new Scanner(System.in);
        String string1=scan.nextLine();
        scan.close();
        System.out.println("The given string is: "+ string1);
        duplicateCharacter.finDuplicateChar(string1);
    }
}
