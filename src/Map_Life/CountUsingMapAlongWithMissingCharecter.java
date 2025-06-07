package Map_Life;

import java.util.HashMap;
import java.util.Map;

public class CountUsingMapAlongWithMissingCharecter {

    public static HashMap<Character,Integer> hm=new HashMap<>();
    public static void main(String[] args)
    {
        String input ="aaabbbccdddhhhjj";
        String [] arr= input.split("");
        for(char ch='a';ch<='j';ch++)
        {
            hm.put(ch,0);
        }
        count(input);

        for(Map.Entry<Character,Integer> mm:hm.entrySet())
        {
            char key=mm.getKey();
            int value=mm.getValue();
            System.out.print(key+""+value);
        }
    }
    public static void count(String op)
    {
        for(int i=0;i<op.length();i++)
        {
            if(hm.containsKey(op.charAt(i)))
            {
                hm.put(op.charAt(i),hm.get(op.charAt(i))+1);
            }
        }
    }

}
