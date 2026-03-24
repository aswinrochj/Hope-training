public class leetcode58 {

    public int lengthOfLastWord(String s) {

        String[] str = s.split(" ");
        int n = str.length;
        return str[n-1].length();
        
    }
    
}
