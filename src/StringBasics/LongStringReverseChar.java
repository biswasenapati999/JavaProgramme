package StringBasics;

public class LongStringReverseChar {
    public static void main(String [] args){
        String s1="rupa is a good girl";
        String [] arr=s1.split(" ");
        reverse(arr);
    }

    public static void reverse(String [] arr){
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=arr[i].length()-1;j>=0;j--)
            {
                sb.append(arr[i].charAt(j));
            }

            sb.append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
