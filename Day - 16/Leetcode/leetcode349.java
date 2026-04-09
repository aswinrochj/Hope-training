import java.util.HashSet;
import java.util.Set;

public class leetcode349 {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();

        for (int n1 : nums1) {
            for (int n2 : nums2) {
                if (n1 == n2) {
                    result.add(n1);
                    break;
                }
            }
        }

        int[] ans = new int[result.size()];
        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }

}
