public class leetcode1518 {

    public int numWaterBottles(int numBottles, int numExchange) {

        return numBottles + ((numBottles - 1) / (numExchange - 1));
    }

}
