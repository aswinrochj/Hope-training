package DAY_12.VsCode;
import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(null);
        list.add(11);
        list.add(20);
        list.set(0,34);
        System.out.println(list);
        list.add(0,13);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list.contains(34));
        System.out.println(list.size());
        list.add(11);
        System.out.println(list.indexOf(11));
        System.out.println(list.lastIndexOf(11));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}

