package core;
import java.util.*;
public class CommonWord
{
    public static void findCommonWord(String[] tab1,String[] tab2)
    {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {
                if (tab1[i] == tab2[j]) {

                    // add common elements
                    set.add(tab1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " , ");
        }
    }
}
