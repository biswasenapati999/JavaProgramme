package StringLifeEasy;

public class StringSumOfNumbers {
    public static void main(String[] args) {
        String s1 = "ab4cd563fvds21";
        int sum = 0;
        for(int i=0;i<s1.length();i++)
        {
            if(Character.isDigit(s1.charAt(i)))
            {
                String temp=s1.substring(i,i+1);
               sum+=Integer.parseInt(temp);
            }
        }

        System.out.println(sum);
    }


}
