class HammingCode {
    public int hammingDistance(int x, int y) {
        int bit = x ^ y;
        return Integer.bitCount(bit);
        
    }
}
