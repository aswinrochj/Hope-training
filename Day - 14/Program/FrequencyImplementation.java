import java.util.HashMap;
public class FrequencyImplementation {

    HashMap<Character,Integer> map = new HashMap<>();

    String s = "aabbbcc";
    
    for(char c : s.toCharArray())
    {
        map.put(c,map.getOrDefault(c,0)+1);
    }
    System.out.println(map);
    
}
