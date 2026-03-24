class SignOfProduct {
    public int arraySign(int[] nums) {
        int x = 0;
        for (int n: nums) {
            if (n == 0) {return 0;}
            x = n < 0 ? ++x : x;
        }
        return x % 2 == 0 ? 1 : -1;
    }
}
