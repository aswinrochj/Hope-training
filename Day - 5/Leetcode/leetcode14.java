public class leetcode14 {

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = common(prefix, strs[i]);
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }

    public String common(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int i = 0;

        while (i < len && a.charAt(i) == b.charAt(i)) {
            i++;
        }

        return a.substring(0, i);
    }
    
}
