package StringBasics;

public class StringReverse {
public static void main(String[] args){
    String s1="india";
    reverseString(s1);
}
public static void reverseString(String rev){
    StringBuilder sb=new StringBuilder();
    for(int i=rev.length()-1;i>=0;i--)
    {
       sb.append(rev.charAt(i));
    }

    System.out.println(sb.toString());
}
}
