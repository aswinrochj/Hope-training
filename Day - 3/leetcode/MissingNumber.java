class MissingNumber {
    public int missingNumber(int[] nums) {
        
        int  xor  = 0;
        int i = 0;
        for(i = 0; i<nums.length; i++){
            xor = xor ^ nums[i] ^ i;
        }

        return xor^i;
    }
}
