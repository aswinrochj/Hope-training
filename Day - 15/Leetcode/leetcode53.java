public class leetcode53 {
    public int maxSubArray(int[] nums) {

        int total = 0;
        int result = nums[0];

        for(int num : nums)
        {
            if(total < 0)
            {
                total = 0;
            }
            total += num;
            result = Math.max(total,result);
        }

        return result;
        
    }
    
}
