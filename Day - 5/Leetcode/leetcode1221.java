public class leetcode1221 {

    public int balancedStringSplit(String s) {

        int count = 0;
        int balance = 0;
        int len = s.length();

        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='R')
            {
                balance++;
            }
            else
            {
                balance--;
            }
            if(balance==0)
            {
                count++;
            }
        }
        return count;
        
    }
    
}
