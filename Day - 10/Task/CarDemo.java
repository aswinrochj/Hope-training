class Car {

    
    private String brand;
    private String model;
    private int speed;

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

   
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }
}


public class CarDemo {

    public static void main(String[] args) {

        Car c = new Car();

        // Setting values using setters
        c.setBrand("Toyota");
        c.setModel("Innova");
        c.setSpeed(120);

        // Getting values using getters
        System.out.println("Car Details:");
        System.out.println("Brand: " + c.getBrand());
        System.out.println("Model: " + c.getModel());
        System.out.println("Speed: " + c.getSpeed() + " km/h");
    }
}