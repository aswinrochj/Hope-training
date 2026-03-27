public class SecondFreqChar
{
    public static char secondFrequentChar(String str) {

    int first = 0, second = 0;
    

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        // Check if already processed before
        boolean visited = false;
        for (int k = 0; k < i; k++) {
            if (str.charAt(k) == ch) {
                visited = true;
                break;
            }
        }

        if (visited) continue;

        // Count frequency of current character
        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
        }

        // Update first and second
        if (count > first) {
            second = first;
            first = count;
        } else if (count > second && count < first) {
            second = count;
        }
    }

    // Find the character with second frequency
    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        int count = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == ch) {
                count++;
            }
        }

        if (count == second) {
            return ch;
        }
    }

    return '\0';
}
}