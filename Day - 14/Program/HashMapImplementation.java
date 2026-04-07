import java.util.HashMap;

class HashMapimplementation
{
    public static void main(String[] args) {
        {
            HashMap<String,Integer> map = new HashMap<>();

            map.put("Hello", 1);
            map.get("Hello");  
            System.out.println(map.get("Hello")); 
            System.out.println(map.getOrDefault("KSP", 1));
            map.put("KSP",2);
            System.out.println(map.getOrDefault("KSP", 2));

            
        }
        
    }
}