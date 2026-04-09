import java.util.Arrays;

public class leetcode2600 {

    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        // Creating an array of size of ones + zeros + numNegOnes
        int[] array = new int[numOnes + numZeros + numNegOnes];

        // Filling the array from/to positions with the respective numbers
        Arrays.fill(array, 0, numOnes, 1);
        Arrays.fill(array, numOnes, numOnes + numZeros, 0);
        Arrays.fill(array, numOnes + numZeros, numOnes + numZeros + numNegOnes, -1);

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

}
