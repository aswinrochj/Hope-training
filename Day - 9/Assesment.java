public class Assesment{
public static int[] longestSubarray(int[] arr) {
    int n = arr.length;

    int maxLen = 0;
    int start = -1, end = -1;

    for (int i = 0; i < n; i++) {
        int ones = 0, zeros = 0;

        for (int j = i; j < n; j++) {

            if (arr[j] == 1) ones++;
            else zeros++;

            
            if (ones == zeros + 1) {
                if ((j - i + 1) > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
    }

    
    if (start == -1) return new int[]{};

    
    int[] result = new int[maxLen];
    int k = 0;

    for (int i = start; i <= end; i++) {
        result[k++] = arr[i];
    }

    return result;
}
}