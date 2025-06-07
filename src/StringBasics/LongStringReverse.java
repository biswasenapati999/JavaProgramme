package StringBasics;

public class LongStringReverse {
    public static void main(String[] args){
        String s1="i love my india";
        String []arr=s1.split(" ");
        longReverse(arr);

    }

    public static void longReverse(String [] reverse){
        StringBuilder sb=new StringBuilder();
        for(int i=reverse.length-1;i>=0;i--)
        {
            sb.append(reverse[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
