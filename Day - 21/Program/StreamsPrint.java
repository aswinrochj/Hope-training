import java.util.*;
import java.util.stream.Collectors;

public class StreamsPrint {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list = list.stream()
    .filter(i -> i % 2 != 0)
    .map(i -> i * i)
    .collect(Collectors.toList());

    System.out.println(list);


    }
}