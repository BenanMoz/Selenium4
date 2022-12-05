package javaStreams;

import org.testng.annotations.Test;

import  java.util.ArrayList;
import java.util.List;

public class StringAsteriks {
    @Test
    public static void main2()
    {
       // StringAsteriks test01 = new StringAsteriks();

        System.out.println();

        System.out.println("Ferrara_Prisma_Sam**ple_100.csv".toLowerCase());
        System.out.println("*Prisma*.csv".toLowerCase());
        System.out.println(isSubString("Ferrara_Prisma_Sample_100.csv".toLowerCase(), "prisma*.csv*".toLowerCase()));
        System.out.println(isSubString("abcd", "bcd"));
        System.out.println(isSubString("abcd", "*b"));
        System.out.println(isSubString("abcd", "ac"));
        System.out.println(isSubString("abcd", "bd"));
        System.out.println(isSubString("abcd", "b*d"));
        System.out.println(isSubString("abcd", "b\\*d"));
        System.out.println(isSubString("abcd", "\\*d"));
        System.out.println(isSubString("abcd", "b\\*"));

        System.out.println(isSubString("a*cd", "\\*b"));
        System.out.println(isSubString("", "b\\*"));
        System.out.println(isSubString("abcd", ""));

        System.out.println(isSubString("a*bd", "\\*b"));
    }
    // only for non empty Strings
    public static boolean isSubString(String string1,String string2)
    {
        // step 1: split by *, but not by \*
        List<String>list1 = new ArrayList<String>();
        char[]cs = string2.toCharArray();
        int lastIndex = 0 ;
        char lastChar = 0 ;
        int i = 0 ;
        for(; i < cs.length ; ++i)
        {
            if(cs[i]=='*' && lastChar!='\\')
            {
                list1.add(new String(cs,lastIndex,i-lastIndex).replace("\\*", "*"));
                lastIndex = i + 1 ;
            }
            lastChar = cs[i];
        }
        if(lastIndex < i )
        {
            list1.add(new String(cs,lastIndex,i-lastIndex).replace("\\*", "*"));
        }
        // step 2: check indices of each string in the list
        // Note: all indices should be in proper order.
        lastIndex = 0;
        for(String str : list1)
        {
            int newIndex = string1.indexOf(str,lastIndex);
            if(newIndex < 0)
            {
                return false;
            }
            lastIndex = newIndex+str.length();
        }
        return true;
    }
}
