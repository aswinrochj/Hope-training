package util;

import java.util.Comparator;
import model.Task;

public class NameComparator implements Comparator<Task> {
    public int compare(Task t1, Task t2) {
        return t1.getName().compareTo(t2.getName());
    }
}