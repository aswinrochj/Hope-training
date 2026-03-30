public class EmployeeSalary {
    public static void main(String[] args) {

        PartTimeEmployee p = new PartTimeEmployee("John", 101, 200, 5);
        FullTimeEmployee f = new FullTimeEmployee("Alice", 102, 30000);

        System.out.println("Part-Time Salary: " + p.calculateSalary());
        System.out.println("Full-Time Salary: " + f.calculateSalary());
    }
}

abstract class Employee {
    String name;
    int id;

    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    
    abstract double calculateSalary();
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id); 
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}