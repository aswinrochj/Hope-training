 
import java.util.*;
public class LinkedListImplementation {
    public static void main(String[] args) {
        LinkedList<String> runningRace=new LinkedList<>();
        runningRace.add("A");
        runningRace.add("B");
        runningRace.add("C");
        System.out.println(runningRace);
        runningRace.addFirst("Start Race");
        runningRace.remove("B");
        System.out.println("B is disqualified");
        System.out.println(runningRace);
        runningRace.add("Race Completed");
        System.out.println(runningRace);
        System.out.println("A is the winner");
    }
}
