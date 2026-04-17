public class SmallestWord {
    public static String smallestWord(String str) {

        String word = "";
        String minWord = "";
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i <= str.length(); i++) {

            if (i == str.length() || str.charAt(i) == ' ') {

                int length = 0;

                
                for (int j = 0; j < word.length(); j++) {
                    length++;
                }

                if (length < minLength && length > 0) {
                    minLength = length;
                    minWord = word;
                }

                word = "";
            } else {
                word = word + str.charAt(i);
            }
        }

        return minWord;
    }

}