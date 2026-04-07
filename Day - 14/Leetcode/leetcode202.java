import java.util.*;
public class leetcode202 {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();
        while(n != 1)
        {
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);

            n = sqDig(n);

        }
        return true;
        
    }
    public int sqDig(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum = sum + (digit*digit);
            n = n/10;
        }
        return sum;
    }
    
}
