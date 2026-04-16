import java.util.*;
public class Longestsubarraywith0sum {
    int maxLength(int arr[]) {
        // code here
        int sum = 0;
        int maxlen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++)
        {
            sum += arr[i];
            if(sum == 0)
            {
                maxlen = i+1;
                
            }
            else
            {
                if(map.containsKey(sum))
                {
                    int len = i-map.get(sum);
                    maxlen = Math.max(len,maxlen);
                    
                }
                else
                {
                    map.put(sum,i);
                }
            }
        }
        return maxlen;
    }
    
}
