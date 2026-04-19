public class leetcode34 {

    public int[] searchRange(int[] nums, int target) {

        int[] res = new int[]{-1,-1};
        int len = nums.length;

        for(int i = 0; i < len; i++)
        {
            if(nums[i] == target)
            {
                if(res[0] == -1)
                {
                    res[0] = i;   
                }
                res[1] = i;
            }
        }
        return res;
    }
    
}
