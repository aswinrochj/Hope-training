class Chips {
    public int minCostToMoveChips(int[] position) {
        int event = 0;
        int odd = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
