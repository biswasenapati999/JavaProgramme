package Map_Life;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountUsingMap {
    public static HashMap<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args){
int [] arr={1,2,1,2,3,4,4,4};
count(arr);
for(Map.Entry<Integer,Integer> entry:map.entrySet())
{
    int key=entry.getKey();
    int value=entry.getValue();
    System.out.println(key + " : "+ value);
}

    }

    public static void count(int[] arr)
    {
        for(int i=0;i<arr.length;i++)

        {
            if (!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
    }
}
