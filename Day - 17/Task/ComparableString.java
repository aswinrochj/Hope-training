import java.util.*;

class Student implements Comparable<Student>{
    int rollNo;
    String name;

    Student(int rollNo,String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
}

public class ComparableString {      
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(3,"Shruthi"));
        students.add(new Student(1,"Ananya"));
        students.add(new Student(2,"Charlie"));
        students.add(new Student(4,"zendaya"));
        students.add(new Student(5,"tara"));

        Collections.sort(students);

        for(Student s: students){
            System.out.println(s.rollNo + " " + s.name);
        }
    }
}