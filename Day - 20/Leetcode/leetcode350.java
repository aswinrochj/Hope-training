import java.util.*;

public class leetcode350 {

    public int[] intersect(int[] num1, int[] num2) {

        Arrays.sort(num1);
        Arrays.sort(num2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();

        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j])
                i++;
            else if (num1[i] > num2[j])
                j++;
            else {
                list.add(num1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;

    }

}
