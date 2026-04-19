public class ThisKeyWordExample {

    public static void main(String[] args) {
        {
            Student s1 = new Student("Reno", "24CY23");
            s1.display();
            System.out.println(s1.hashCode());
            Student s2 = new Student("Reno", "24CY48");
            s2.display();
            System.out.println(s2.hashCode());
            Student s3 = new Student("Reno", "24CY45");
            s3.display();
            System.out.println(s3.hashCode());
        }
    }
    
}

class Student
{
    String name,rollno;

    public Student(String name, String rollno)  
    {
        this.name = name;       //type one//this.name is say the var name is belong to the class we declared above and the nme is the value we pass using the object
        this.rollno = rollno;
    }
    void display()
    {
        System.out.println("Name : " + this.name +"\nRoll Number: " + this.rollno);
    }
    
    

}
