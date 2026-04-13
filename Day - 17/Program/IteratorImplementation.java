import java.util.*;

public class IteratorImplementation {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(26);
        list.add(30);
        Iterator <Integer> it = list.iterator();
        System.out.println(list);

        while(it.hasNext())
        {
            if(it.next()%2 == 0)
            {
                it.remove();
            }
        }
        System.out.println(list);

    }
    
}
