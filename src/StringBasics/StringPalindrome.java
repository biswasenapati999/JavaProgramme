package StringBasics;

import java.util.Scanner;

public class StringPalindrome {
    static Scanner scn=new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter a String");
        String s1= scn.next();
        Boolean result=isPalindrome(s1);
        System.out.println("String Palindrome " +result);
    }

    public static boolean isPalindrome(String s1)
    {
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i)){
                return false;
            }

        }
        return true;

    }
}
