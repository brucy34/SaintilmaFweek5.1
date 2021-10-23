package core;
import java.util.*;
public class PlayBook
{
    public static void  main(String[]args)
    {
        String[] tab1
                = { "Frame", "border", "Tables", "Number", "block" };

        // create Array 2
        String[] tab2 = { "block", "Block", "Frame" };

        // print Array 1
        System.out.println("Array 1: "
                + Arrays.toString(tab1));

        // print Array 2
        System.out.println("Array 2: "
                + Arrays.toString(tab2));

        System.out.print("Common Elements: ");

        // Find the common elements
        CommonWord.findCommonWord(tab1, tab2);
    }
}
