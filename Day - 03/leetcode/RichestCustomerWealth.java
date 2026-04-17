class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum  = 0;
        int max = Integer.MIN_VALUE;

        for(int[] acc: accounts){
            sum = 0;
            for(int value: acc){
                sum += value;
            }

            if(sum > max) max = sum;
        }
        return max;       
    }
}
