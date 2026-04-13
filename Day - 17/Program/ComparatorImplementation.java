import java.util.*;

public class ComparatorImplementation {
    public static void main(String[] args) {
        
        List<Student> s = new ArrayList<>();

        s.add(new Student(10, 15, 20.5));
        s.add(new Student(5, 25, 70.5));
        s.add(new Student(15, 5, 100.0));
        s.add(new Student(10, 18, 90.0)); // same roll to test mark sorting

        // Sorting
        Collections.sort(s, new AgeComparator());

        // Printing result
        for (Student st : s) {
            System.out.println(st);
        }
    }
}

// Student Class
class Student {
    int rollNo;
    int age;
    double mark;

    Student(int rollNo, int age, double mark) {
        this.rollNo = rollNo;
        this.age = age;
        this.mark = mark;
    }

    public String toString() {
        return rollNo + " " + age + " " + mark;
    }
}

// Comparator Class
class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {

        // Roll number ascending
        int res = Integer.compare(s1.rollNo, s2.rollNo);

        // If roll numbers are same → sort by marks descending
        if (res == 0) {
            return Double.compare(s2.mark, s1.mark);
        }

        return res;
    }
}