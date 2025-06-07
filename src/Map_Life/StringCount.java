package Map_Life;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StringCount {
    public static ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();
    public static void main(String[] args){
        String s1="biswa ranjan senapati ranjan senapati";
        String [] arr=s1.split(" ");
        count(arr);
        for(Map.Entry<String,Integer> m:map.entrySet()){
            String key=m.getKey();
            int value=m.getValue();
            System.out.println(key + " = " + value);
        }


    }

    public static void count(String [] arr){
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
    }

}
