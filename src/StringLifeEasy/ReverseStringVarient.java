package StringLifeEasy;

public class ReverseStringVarient {
static String s2="";
    static String s4="";
    public static void main(String[] args)
    {
        String s1="r-ak-esh";
       String s3=s1.replace("-","");

       for(int i=s3.length()-1;i>=0;i--)
       {
           s4+=s3.charAt(i);
       }
        reverseString(s1);
    }

    public static void reverseString(String s1)
    {
        int j=0;
        for(int i=0;i<s1.length();i++)
        {
                if (Character.isAlphabetic(s1.charAt(i)))
                {
                    s2+=s4.charAt(j++);
                }
                else
                {
                    s2+="-";
                }
        }
        System.out.print(s2);
    }
}
