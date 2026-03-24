import java.util.Scanner;

class CircleArea {

    // 1. With return type & with parameters
    double area1(double r) {
        return Math.PI * r * r;
    }

    // 2. With return type & without parameters
    double area2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        return Math.PI * r * r;
        
    }

    // 3. Without return type & with parameters
    void area3(double r) {
        double area = Math.PI * r * r;
        System.out.println("Area (method 3): " + area);
    }

    // 4. Without return type & without parameters
    void area4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println("Area (method 4): " + area);
    }

    public static void main(String[] args) {

        CircleArea obj = new CircleArea();
        Scanner sc = new Scanner(System.in);

        // Method 1
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area (method 1): " + obj.area1(r));

        // Method 2
        System.out.println("Area (method 2): " + obj.area2());

        // Method 3
        System.out.print("Enter radius: ");
        r = sc.nextDouble();
        obj.area3(r);

        // Method 4
        obj.area4();

    }
}