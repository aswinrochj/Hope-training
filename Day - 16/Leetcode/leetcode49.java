import java.util.*;

public class leetcode49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortword = new String(chars);

            if (!map.containsKey(sortword)) {
                map.put(sortword, new ArrayList<>());
            }

            map.get(sortword).add(word);

        }
        return new ArrayList<>(map.values());

    }

}
