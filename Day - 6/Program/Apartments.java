class Apartment {

    Apartment(int type) {

        switch(type) {
            case 1:
                System.out.println("Apartment Type 1:");
                System.out.println("1 Bedroom");
                System.out.println("1 Kitchen");
                System.out.println("1 Public Washroom");
                System.out.println("1 Hall");
                System.out.println("1 Public Playground");
                System.out.println("1 Dining Hall");
                break;

            case 2:
                System.out.println("\nApartment Type 2:");
                System.out.println("2 Bedrooms with attached washrooms");
                System.out.println("1 Public Hall");
                System.out.println("2 Kitchens");
                System.out.println("1 Public Playground");
                System.out.println("1 Dining Hall");
                break;

            case 3:
                System.out.println("\nApartment Type 3:");
                System.out.println("4 Bedrooms with 4 attached washrooms");
                System.out.println("Each 2 bedrooms share a public hall");
                System.out.println("1 Public Kitchen");
                System.out.println("1 Public Playground");
                System.out.println("1 Dining Hall");
                break;

            default:
                System.out.println("Invalid Apartment Type");
        }
    }
}

public class Apartments {
    public static void main(String[] args) {

        Apartment a1 = new Apartment(1);
        Apartment a2 = new Apartment(2);
        Apartment a3 = new Apartment(3);
    }
}