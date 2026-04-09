import java.util.Scanner;

public class leetcode387 {
    public static int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }

    // Main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.next();
        System.out.println(firstUniqChar(str));
        input.close();
        ;
    }
}