package StringLifeEasy;

public class StringDuplicateCount {
    public static void main(String[] args){
        String s1="banana";

        String s2="";
        for(int i=0;i<=s1.length()-1;i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) == -1) {
                s2 += s1.charAt(i);
                countDuplicate(s1,c);
            }

        }
    }

    public static void countDuplicate(String s1,char c)
    {

     int count= s1.length() - s1.replace(c+"", "").length();
        System.out.println(c +"="+ count);

    }

}
